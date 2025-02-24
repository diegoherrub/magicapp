package pol.rubiano.magicapp.app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import pol.rubiano.magicapp.app.data.local.entities.DeckEntity

@Dao
interface DeckDao {

    @Query("SELECT * FROM decks")
    suspend fun getLocalDecksDao(): List<DeckEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveToLocalDecksDao(vararg decks: DeckEntity)
}