package com.thisiskelechi.note_app.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert
    fun addNote(note: Note)

    @Query("SELECT * FROM Note")
    fun getAllNOtes(): List<Note>

    @Insert
    fun addMultipleNote(vararg note:Note)
}