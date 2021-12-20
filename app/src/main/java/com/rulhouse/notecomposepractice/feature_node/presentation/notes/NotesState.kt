package com.rulhouse.notecomposepractice.feature_node.presentation.notes

import com.rulhouse.notecomposepractice.feature_node.domain.model.Note
import com.rulhouse.notecomposepractice.feature_node.domain.util.NoteOrder
import com.rulhouse.notecomposepractice.feature_node.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
