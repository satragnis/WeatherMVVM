/*
package com.example.weathermvvm.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weathermvvm.data.db.entity.CURRENT_WEATHER_ID
import com.example.weathermvvm.data.db.entity.CurrentWeatherEntry

@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query(value = "select * from current_weather where id = $CURRENT_WEATHER_ID" )
    fun getWeatherMetric(): LiveData<CurrentWeatherEntry>


}*/
