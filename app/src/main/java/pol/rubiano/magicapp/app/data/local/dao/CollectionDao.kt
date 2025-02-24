package pol.rubiano.magicapp.app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import pol.rubiano.magicapp.app.data.local.entities.CollectionEntity

@Dao
interface CollectionDao {

    @Query("SELECT * FROM collections")
    suspend fun getLocalCollectionsDao(): List<CollectionEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveToLocalCollectionsDao(vararg collections: CollectionEntity)
}