package at.htl.klassestudent;

import java.util.Arrays;
import java.util.Collections;

public class Klasse {
    private String klassenbezeichnung;
    private Student[] students;

    public Klasse() {
    }

    public Klasse(String klassenbezeichnung) {
        this();
        this.klassenbezeichnung = klassenbezeichnung;
    }

    public void add(Student student) {
        // wenn noch kein Array erstellt wurde ...
        if (students == null) {
            students = new Student[1];
        } else {
            Student[] help = new Student[students.length + 1];
            help[0] = students[0];
        }
        students[students.length - 1] = student;
    }

    public String getKlassenbezeichnung() {
        return klassenbezeichnung;
    }

    public void setKlassenbezeichnung(String klassenbezeichnung) {
        this.klassenbezeichnung = klassenbezeichnung;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return String.valueOf(klassenbezeichnung);
    }

    public void sortBubble(){

    }
}
