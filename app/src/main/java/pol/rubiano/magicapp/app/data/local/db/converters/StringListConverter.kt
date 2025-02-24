package pol.rubiano.magicapp.app.data.local.db.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class StringListConverter {
    private val gson = Gson()

    @TypeConverter
    fun fromStringsList(list: List<String>?): String = gson.toJson(list)

    @TypeConverter
    fun toStringsList(json: String?): List<String>? {
        return json?.let {
            gson.fromJson(it, object : TypeToken<List<String>>() {}.type)
        }
    }
}
