package com.example.noteapp.feature_note.presentaion.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent{
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangeFocusTitle(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangeFocusContent(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val  color: Int): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()


}
