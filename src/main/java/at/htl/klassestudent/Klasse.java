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
            for (int i = 0; i < help.length - 1; i++) {
                help[i] = students[i];
            }
            students = help;
        }
        students[students.length - 1] = student;
    }

    public void grundSort() {

        showArray();
        for (int j = 0; j < students.length - 1; j++) {
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i].compareTo(students[j]) < 0){
                    Student help = students[i];
                    students[i] = students[j];
                    students[j] = help;
                }
            }
            showArray();
        }
    }

    public void showArray(){
        for (Student student : students) {
            System.out.print(student + " - ");
        }
        System.out.println();
    }

    //region Getter und Setter
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

    //endregion


    @Override
    public String toString() {
        return klassenbezeichnung;
    }
}
