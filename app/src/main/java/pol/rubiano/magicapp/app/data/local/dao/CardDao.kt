package pol.rubiano.magicapp.app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import pol.rubiano.magicapp.app.data.local.entities.CardEntity

@Dao
interface CardDao {

    @Query("SELECT * FROM cards")
    suspend fun getLocalCardsDao(): List<CardEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveToLocalCardsDao(vararg cards: CardEntity)
}