package schoolapp.staffs;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import schoolapp.Person;
import schoolapp.customexceptions.UnAuthourizedException;
import schoolapp.pupils.Applicant;
import schoolapp.pupils.Pupil;
import schoolapp.pupils.Student;

import static org.junit.jupiter.api.Assertions.*;
class StaffTest {
  private Staff staff ;
  private Pupil pupil;


   @BeforeEach()
    void setUp() {

       staff = new Principal("Abraham",
               "John", Person.Gender.MALE,
               24, "Administration");

       pupil = new Applicant("Taiye",
               "Olusayo", Person.Gender.FEMALE, 4,"Art");
    }

    @Test
    @DisplayName("Should Throw UnAuthorized Exception")
    void admitStudent() {
       Staff teacher = SchoolApplicationFactoryMethods.getTeacher();

       assertThrows(UnAuthourizedException.class,
               () ->{
                  staff.admitStudent(teacher, pupil);
       });





    }

    void teachStudent() {
    }
}