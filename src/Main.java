import notes.Note;
import notes.NotesDelegator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NotesDelegator notesDelegator = new NotesDelegator();
        final String note = "This is a test note that i am writing bla bla bla";
        final String noteType = "Task";
        final int noteUrgency = 3;
        final String status = "INPR";
        Note newNote = notesDelegator.createNewNote(note, noteType, noteUrgency, status);

        //TODO
        //Send the Note to intelligence to be
        // 1. processed
        // 2. Assigned a deadline and
        // 3. Added into the calendar

    }
}