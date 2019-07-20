package com.example.cleanarchitecture.data.di.module;

import com.example.cleanarchitecture.data.database.Database;
import com.example.cleanarchitecture.data.database.DatabaseImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseImplModule {

    @Provides
    Database providesDatabase(DatabaseImpl database){
        return database;
    }
}
