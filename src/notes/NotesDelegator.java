package notes;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class NotesDelegator {

    public Map<String, Note> notes = new HashMap<>();

    public Note createNewNote(
            final String note,
            final String noteType,
            final int noteUrgency,
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

    public void editNoteContent(String noteId, String newContent){
        Note note = getNote(noteId);
        note.setNoteContent(newContent);
        note.setLastEdited(new Date());

    }

    public Note getNote(String noteId){
        return notes.get(noteId);
    }

    private void addNewNote(Note newNote){
        notes.put(newNote.noteId, newNote);
    }

}
