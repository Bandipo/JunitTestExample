package schoolapp.pupils;

import schoolapp.course.Course;

public class Student extends Pupil implements Learnable {

    public Student(String firstName, String lastName, Gender gender, int age, String department) {
        super(firstName, lastName, gender, age, department);
    }

    @Override
    public void takeCourse(Course course) {

    }

    @Override
    public String toString() {
        return  String.format("Student{firstName: %s, lastName: %s" +
                        " gender: %s, age: %d , department: %s}",
                this.getFirstName(), this.getLastName(),
                this.getGender().name(),
                this.getAge(), this.getDepartment());
    }
}
