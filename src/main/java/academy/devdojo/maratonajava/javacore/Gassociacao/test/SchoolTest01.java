package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.School;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Iruka");
        Teacher teacher2 = new Teacher("Kakashi");
        Teacher[] teachers = {teacher1, teacher2};
        School school = new School("Konoha", teachers);
        school.imprime();

    }
}
