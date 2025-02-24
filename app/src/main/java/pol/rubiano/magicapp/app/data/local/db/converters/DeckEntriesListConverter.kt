package pol.rubiano.magicapp.app.data.local.db.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import pol.rubiano.magicapp.app.domain.DeckEntry

class DeckEntriesListConverter {
    private val gson = Gson()

    @TypeConverter
    fun fromDeckEntries(list: List<DeckEntry>?): String = gson.toJson(list)

    @TypeConverter
    fun toDeckEntries(json: String?): List<DeckEntry>? {
        return json?.let {
            gson.fromJson(it, object : TypeToken<List<DeckEntry>>() {}.type)
        }
    }
}