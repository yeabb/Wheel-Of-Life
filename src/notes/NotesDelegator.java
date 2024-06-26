package notes;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class NotesDelegator {

    public Map<String, Note> notes;

    public Note createNewNote(
            final String note,
            final Date noteType,
            final String noteUrgency,
            final String status
            )
    {
        final String notId = UUID.randomUUID().toString();

        final Date now = new Date();

        Note newNote = new Note(
                note,
                notId,
                now,
                noteType,
                noteUrgency,
                status,
                now);

        addNewNote(newNote);
        return newNote;
    }

    public void deleteNote(String noteId){
        notes.remove(noteId);
    }

    private void addNewNote(Note newNote){
        notes.put(newNote.noteId, newNote);
    }

    public void EditNote(Note editNote){

    }

    public Note getNote(String noteId){
        return notes.get(noteId);
    }

    public Note change

}
