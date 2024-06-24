package notes;

import java.util.Collection;
import java.util.Map;

public class NotesDelegator {

    public Map<Long, Note> notes;

    public void deleteNote(Long noteId){
        notes.remove(noteId);
    }

    public void addNewNote(Note newNote){
        notes.put(newNote.noteId, newNote);
    }

    public void EditNote(Note editNote){

    }

}
