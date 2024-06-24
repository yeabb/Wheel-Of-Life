package notes;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Note {

    public String noteContent;

    public Long noteId;

    public Date dayCreated;

    public Date noteType;

    public Date lastEdited;



    public Note(final String note, final Long noteId, final Date dayCreated, final Date noteType, final Date lastEdited){
        this.noteContent = note;

        this.noteId = noteId;

        this.dayCreated = dayCreated;

        this.noteType = noteType;

        this.lastEdited = lastEdited;


    }

}
