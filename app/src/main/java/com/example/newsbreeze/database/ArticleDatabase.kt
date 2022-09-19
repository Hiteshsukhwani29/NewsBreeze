package com.example.newsbreeze.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.newsbreeze.model.Article

@Database( entities = [Article::class], version = 1)
@TypeConverters(converter::class)
abstract class ArticleDatabase: RoomDatabase() {

    abstract val dao: ArticeDao

    companion object {
        @Volatile
        private var INSTANCE: ArticleDatabase? = null

        fun getInstance(context: Context): ArticleDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ArticleDatabase::class.java,
                        "article_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}