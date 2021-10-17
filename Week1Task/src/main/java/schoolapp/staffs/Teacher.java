package schoolapp.staffs;


public class Teacher extends Staff {

    public Teacher(String firstName, String lastName, Gender gender, int age, String department) {
        super(firstName, lastName, gender, age, department);
    }

//    @Override
//    public void teachStudent(Staff teacher) {
//        super.teachStudent(teacher);
//    }

    @Override
    public String toString() {
        return String.format("Teacher{firstName: %s, lastName: %s" +
                " gender: %s, age: %d , department: %s}",
                    this.getFirstName(), this.getLastName(),
                this.getGender().name(),
                 this.getAge(), this.getDepartment());
    }
}
