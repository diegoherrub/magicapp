package pol.rubiano.magicapp.app.di

import android.content.Context
import androidx.room.Room
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import pol.rubiano.magicapp.app.data.local.db.MagicAppDataBase

@Module
@ComponentScan
class LocalModule {

    @Single
    fun provideDataBase(context: Context): MagicAppDataBase {
        val db = Room.databaseBuilder(
            context,
            MagicAppDataBase::class.java,
            "magic-app-database"
        )
        db.fallbackToDestructiveMigration()
        return db.build()
    }
}