package schoolapp.staffs;

import schoolapp.Person;
import schoolapp.customexceptions.UnAuthourizedException;
import schoolapp.pupils.Applicant;
import schoolapp.pupils.Pupil;

public abstract class Staff extends Person implements NonAcademic, Admittable, Teachable {
    protected Staff(String firstName, String lastName, Person.Gender gender, int age, String department) {
        super(firstName, lastName, gender, age, department);
    }


    @Override
    public void admitStudent(Staff principal, Pupil applicant) {
        if(  principal instanceof Principal ){
            if(applicant.getAge()<7 || applicant.getAge()>30){
                System.out.printf("%n Principal %s admits %s  %n", principal.getFirstName(),applicant.getFirstName());
            }else{
                System.out.println(applicant.getFirstName() + " is below or above the Age School age range");
            }

        }else {
            throw new UnAuthourizedException("You are not a teacher");
        }

    }


    @Override
    public void teachStudent(Staff teacher) {
//        if(  teacher instanceof Teacher ){
//            System.out.printf("%n Teacher %s teaches %n", teacher.getFirstName());
//
//        }else {
//            throw new UnAuthourizedException("You are not a teacher");
//        }

    }










}
