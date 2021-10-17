package schoolapp.pupils;

import schoolapp.Person;

public abstract class Pupil extends Person {


    public Pupil(String firstName, String lastName, Gender gender, int age, String department) {
        super(firstName,lastName,gender,age,department);
    }


}
