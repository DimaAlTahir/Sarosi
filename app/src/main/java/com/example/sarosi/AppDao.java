package com.example.sarosi;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import static androidx.room.OnConflictStrategy.REPLACE;

import java.util.List;

@Dao
public interface AppDao {
    @Query("SELECT * FROM cities ORDER BY data")
    List<Cities> getCities();

    @Insert(onConflict = REPLACE )
    void insertCities(Cities... city);

    @Update
    void update(Cities cities);

    @Delete
    void delete(Cities cities);

}
