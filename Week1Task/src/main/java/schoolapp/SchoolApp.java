package schoolapp;

import schoolapp.pupils.Applicant;
import schoolapp.pupils.Pupil;
import schoolapp.pupils.Student;
import schoolapp.service.SchoolInterface;
import schoolapp.service.impl.School;
import schoolapp.staffs.Principal;
import schoolapp.staffs.Staff;
import schoolapp.staffs.Teacher;

public class SchoolApp {

    public static void main(String[] args) {


        Staff principal = new Principal("Abraham",
                "John", Person.Gender.MALE,
                24, "Administration");

        Staff teacher = new Teacher("Ade","OluwaSeun",
                        Person.Gender.MALE,25,"Academics");


        Student tobi = new Student("Tobi", "Dada"
                , Person.Gender.FEMALE, 18,"Science");

        Pupil taiye = new Applicant("Taiye",
                "Olusayo", Person.Gender.FEMALE, 4,"Art");


        principal.admitStudent(principal,taiye);

        teacher.teachStudent(teacher);

        SchoolInterface school = new School();
        school.addStaff(principal);
        school.addStaff(teacher);
        school.addStudent(tobi);
        school.addStudent(taiye);

        school.listAllStaffs();

        school.listAllStudents();








    }
}
