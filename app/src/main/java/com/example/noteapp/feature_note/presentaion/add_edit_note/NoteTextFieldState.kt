package com.example.noteapp.feature_note.presentaion.add_edit_note

data class NoteTextFieldState (
    val text: String = "",
    val hint: String = "",
    val isHintVisible : Boolean = true
)