package com.thisiskelechi.note_app.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.thisiskelechi.note_app.R
import com.thisiskelechi.note_app.db.Note
import com.thisiskelechi.note_app.db.NoteDatabase

/**
 * A simple [Fragment] subclass.
 */
class AddNoteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_note, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        NoteDatabase(activity!!).getNoteDao().addNote(Note)
    }
}
