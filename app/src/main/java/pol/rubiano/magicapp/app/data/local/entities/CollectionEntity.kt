package pol.rubiano.magicapp.app.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import pol.rubiano.magicapp.app.data.local.db.converters.CollectionEntriesListConverter
import pol.rubiano.magicapp.app.domain.CollectionEntry

const val COLLECTION_TABLE = "collections"
const val COLLECTION_ID = "id"
const val COLLECTION_ENTRIES_TABLE = "collection_entries"
const val COLLECTION_ENTRY_COLLECTION_ID = "collection_id"
const val COLLECTION_ENTRY_CARD_ID = "card_id"

@Entity(tableName = COLLECTION_TABLE)
@TypeConverters(CollectionEntriesListConverter::class)
data class CollectionEntity(
    @PrimaryKey @ColumnInfo(name = COLLECTION_ID) val id: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "cards") val cards: List<CollectionEntry>
)

@Entity(
    tableName = COLLECTION_ENTRIES_TABLE,
    primaryKeys = [COLLECTION_ENTRY_COLLECTION_ID, COLLECTION_ENTRY_CARD_ID],
    foreignKeys = [
        ForeignKey(
            entity = CollectionEntity::class,
            parentColumns = [COLLECTION_ID],
            childColumns = [COLLECTION_ENTRY_COLLECTION_ID],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = CardEntity::class,
            parentColumns = [CARD_ID],
            childColumns = [COLLECTION_ENTRY_CARD_ID],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = [COLLECTION_ENTRY_CARD_ID])]
)
data class CollectionEntryEntity(
    @ColumnInfo(name = COLLECTION_ENTRY_COLLECTION_ID) val collectionId: String,
    @ColumnInfo(name = COLLECTION_ENTRY_CARD_ID) val cardId: String,
    @ColumnInfo(name = "quantity") val quantity: Int,
    @ColumnInfo(name = "is_foil") val isFoil: Boolean
)