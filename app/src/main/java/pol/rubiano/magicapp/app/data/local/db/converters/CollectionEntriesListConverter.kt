package pol.rubiano.magicapp.app.data.local.db.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import pol.rubiano.magicapp.app.domain.CollectionEntry

class CollectionEntriesListConverter {
    private val gson = Gson()

    @TypeConverter
    fun fromCollectionsList(list: List<CollectionEntry>?): String = gson.toJson(list)

    @TypeConverter
    fun toCollectionsList(json: String?): List<CollectionEntry>? {
        return json?.let {
            gson.fromJson(it, object : TypeToken<List<CollectionEntry>>() {}.type)
        }
    }
}