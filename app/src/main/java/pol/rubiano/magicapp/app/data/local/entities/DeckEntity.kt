package pol.rubiano.magicapp.app.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import pol.rubiano.magicapp.app.data.local.db.converters.DeckEntriesListConverter
import pol.rubiano.magicapp.app.domain.DeckEntry

const val DECK_TABLE = "decks"
const val DECK_ID = "id"
const val DECK_ENTRIES_TABLE = "deck_entries"
const val DECK_ENTRY_DECK_ID = "deck_id"
const val DECK_ENTRY_CARD_ID = "card_id"

@Entity(tableName = DECK_TABLE)
@TypeConverters(DeckEntriesListConverter::class)
data class DeckEntity(
    @PrimaryKey @ColumnInfo(name = DECK_ID) val id: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "format") val format: String,
    @ColumnInfo(name = "cards") val cards: List<DeckEntry>,
    @ColumnInfo(name = "sideboard") val sideboard: List<DeckEntry>,
    @ColumnInfo(name = "maybeBoard") val maybeBoard: List<DeckEntry>
)

@Entity(
    tableName = DECK_ENTRIES_TABLE,
    primaryKeys = [DECK_ENTRY_DECK_ID, DECK_ENTRY_CARD_ID],
    foreignKeys = [
        ForeignKey(
            entity = DeckEntity::class,
            parentColumns = [DECK_ID],
            childColumns = [DECK_ENTRY_DECK_ID],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = CardEntity::class,
            parentColumns = [CARD_ID],
            childColumns = [DECK_ENTRY_CARD_ID],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = [DECK_ENTRY_CARD_ID])]
)
data class DeckEntryEntity (
    @ColumnInfo(name = DECK_ENTRY_DECK_ID) val deckId: String,
    @ColumnInfo(name = DECK_ENTRY_CARD_ID) val cardId: String,
    @ColumnInfo(name = "quantity") val quantity: Int
)