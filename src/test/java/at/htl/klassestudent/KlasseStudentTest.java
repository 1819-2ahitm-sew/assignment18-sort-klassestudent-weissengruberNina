package at.htl.klassestudent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class KlasseStudentTest {

    @Test
    public void student_compareTwoStudents_success(){
        Student maxi = new Student("Maxi", "Müller");
        Student susi = new Student("Susi", "Scholz");
        int compare = maxi.compareTo(susi);
        assertThat(compare, lessThan(0));
    }

    @Test
    public void student_compareEqualStudents_success(){
        Student maxi = new Student("Maxi", "Müller");
        Student maxi2 = new Student("Maxi", "Müller");
        int compare = maxi.compareTo(maxi2);
        assertThat(compare, is(0));
    }

    @Test
    public void student_compareTwoStudentsViceVersa_success(){
        Student susi = new Student("Susi", "Scholz");
        Student maxi = new Student("Maxi", "Müller");
        int compare = susi.compareTo(maxi);
        assertThat(compare, greaterThan(0));
    }

    @Test
    public void klasse_insertFirstStudent_success() {
        Student magda = new Student("Magdalena", "Scholz");
        Klasse klasse = new Klasse("2ahitm");
        klasse.add(magda);

        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),arrayWithSize(1));
    }

    @Test
    public void klasse_insertSecondStudent_success() {
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Weissengruber");
        Klasse klasse = new Klasse("2ahitm");
        klasse.add(magda);
        klasse.add(nina);

        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),hasItemInArray(nina));
        assertThat(klasse.getStudents(),arrayWithSize(2));
    }

    @Test
    public void klasse_insertThirdStudent_success() {
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Weissengruber");
        Student meris = new Student("Meris", "Besic");
        Klasse klasse = new Klasse("2ahitm");
        klasse.add(magda);
        klasse.add(nina);
        klasse.add(meris);

        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),hasItemInArray(nina));
        assertThat(klasse.getStudents(),hasItemInArray(meris));
        assertThat(klasse.getStudents(),arrayWithSize(3));
    }

    @Test
    public void klasse_insertFourthStudent_success() {
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Weissengruber");
        Student meris = new Student("Meris", "Besic");
        Student adrian = new Student("Adrian", "Mooser");
        Klasse klasse = new Klasse("2ahitm");
        klasse.add(magda);
        klasse.add(nina);
        klasse.add(meris);
        klasse.add(adrian);

        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),hasItemInArray(nina));
        assertThat(klasse.getStudents(),hasItemInArray(meris));
        assertThat(klasse.getStudents(),hasItemInArray(adrian));
        assertThat(klasse.getStudents(),arrayWithSize(4));
    }

    @Test
    public void klasse_grundSort_success(){
        Klasse ahitm2 = new Klasse("2ahitm");
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Weissengruber");
        Student meris = new Student("Meris", "Besic");
        Student adrian = new Student("Adrian", "Mooser");
        Klasse klasse = new Klasse("2ahitm");
        klasse.add(magda);
        klasse.add(nina);
        klasse.add(meris);
        klasse.add(adrian);

        klasse.grundSort();

        assertThat(klasse.getStudents(), arrayContaining(Arrays.asList(meris, adrian, magda, nina)));
    }
}