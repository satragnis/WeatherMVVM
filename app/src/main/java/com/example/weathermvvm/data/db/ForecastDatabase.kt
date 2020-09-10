//package com.example.weathermvvm.data.db
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import com.example.weathermvvm.data.db.entity.CurrentWeatherEntry
//
//@Database(
//    entities = [CurrentWeatherEntry::class],
//    version = 1
//)
//abstract class ForecastDatabase:RoomDatabase() {
//    abstract fun currentWeatherDao():CurrentWeatherDao
//
//    companion object{
//        //for threads to have immediate access
//        @Volatile private var instance: ForecastDatabase? =null
//        private val LOCK = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
//            instance ?: buildDatabase(context)
//        }
//
//        private fun buildDatabase(context: Context){
//           instance = Room.databaseBuilder(context.applicationContext,
//            ForecastDatabase::class.java,"forecast.db")
//                .build()
//        }
//    }
//}