package pol.rubiano.magicapp.app.data.local.db.converters

import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DateConverter {
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

    @TypeConverter
    fun fromDateToString(date: Date?): String? {
        return date?.let { dateFormat.format(it) }
    }

    @TypeConverter
    fun fromStringToDate(dateString: String?): Date? {
        return dateString?.let { dateFormat.parse(it) }
    }
}
