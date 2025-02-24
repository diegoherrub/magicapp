package pol.rubiano.magicapp.app.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import pol.rubiano.magicapp.app.data.local.dao.CardDao
import pol.rubiano.magicapp.app.data.local.dao.CollectionDao
import pol.rubiano.magicapp.app.data.local.db.converters.CollectionEntriesListConverter
import pol.rubiano.magicapp.app.data.local.entities.CardEntity
import pol.rubiano.magicapp.app.data.local.db.converters.DateConverter
import pol.rubiano.magicapp.app.data.local.db.converters.DeckEntriesListConverter
import pol.rubiano.magicapp.app.data.local.db.converters.StringListConverter
import pol.rubiano.magicapp.app.data.local.entities.CollectionEntity
import pol.rubiano.magicapp.app.data.local.entities.CollectionEntryEntity
import pol.rubiano.magicapp.app.data.local.entities.DeckEntity
import pol.rubiano.magicapp.app.data.local.entities.DeckEntryEntity

@Database(
    entities = [
        CardEntity::class,
        CollectionEntity::class,
        CollectionEntryEntity::class,
        DeckEntity::class,
        DeckEntryEntity::class,
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(
    DateConverter::class,
    StringListConverter::class,
    CollectionEntriesListConverter::class,
    DeckEntriesListConverter::class,
)
abstract class MagicAppDataBase : RoomDatabase() {
    abstract fun cardDao(): CardDao
    abstract fun collectionDao(): CollectionDao
}