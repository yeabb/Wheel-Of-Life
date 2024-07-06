package notes;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Note {

    public String noteContent;

    final public String noteId;

    final public Date dayCreated;

    public String noteType;

    public int noteUrgency;

    public String status;

    public Date lastEdited;



    public Note(
            final String noteContent,
            final String noteId,
            final Date dayCreated,
            final String noteType,
            final int noteUrgency,
            final String status,
            final Date lastEdited)
    {
        this.noteContent = noteContent;

        this.noteId = noteId;

        this.dayCreated = dayCreated;

        this.noteType = noteType;

        this.lastEdited = lastEdited;

        this.noteUrgency = noteUrgency;

        this.status = status;


    }

}
