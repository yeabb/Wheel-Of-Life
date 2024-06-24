package notes;

public class Note {

    public String noteContent;

    public Long noteId;


    public Note(final String note, final Long NoteId){
        this.noteContent = note;
        this.noteId = NoteId;
    }
}
