package schoolapp.staffs;




public class Principal extends Staff {


    public Principal(String firstName, String lastName, Gender gender, int age, String department) {
        super(firstName, lastName, gender, age, department);
    }


    @Override
    public String toString() {
        return  String.format("Principal{firstName: %s, lastName: %s" +
                        " gender: %s, age: %d , department: %s}",
                this.getFirstName(), this.getLastName(),
                this.getGender().name(),
                this.getAge(), this.getDepartment());
    }
}
