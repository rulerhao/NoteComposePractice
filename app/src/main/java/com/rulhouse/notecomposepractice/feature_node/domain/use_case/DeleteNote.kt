package com.rulhouse.notecomposepractice.feature_node.domain.use_case

import com.rulhouse.notecomposepractice.feature_node.domain.model.Note
import com.rulhouse.notecomposepractice.feature_node.domain.repository.NoteRepository

class DeleteNote (
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}