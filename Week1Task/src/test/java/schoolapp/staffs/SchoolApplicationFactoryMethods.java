package schoolapp.staffs;

import schoolapp.Person;

public class SchoolApplicationFactoryMethods {

    static Staff getTeacher(){

        return new Teacher("Ade","OluwaSeun",
                Person.Gender.MALE,25,"Academics");
    }
}
