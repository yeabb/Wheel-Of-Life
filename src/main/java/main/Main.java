package main;

import notes.Note;
import notes.NotesDelegator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final String note = "This is a test note that i am writing bla bla bla";
        final String noteType = "Task";
        final int noteUrgency = 3;
        final String status = "INPR";

        NotesDelegator notesDelegator = new NotesDelegator();
        Note newNote = notesDelegator.createNewNote(note, noteType, noteUrgency, status);

        System.out.println(newNote.noteContent);
    }
}