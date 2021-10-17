package schoolapp;

import java.util.Objects;

public abstract class Person {


    private String firstName;
    private String lastName;
    private Gender gender ;
    private int age;
    private String department;

    public Person() {
    }

    public Person(String firstName, String lastName, Gender gender, int age) {
        this(firstName, lastName, gender,age,"NIL");

    }

    public Person(String firstName, String lastName, Gender gender, int age, String department) {


        this.firstName = firstName != null &&firstName.length()>1 ? firstName: "Default";
        this.lastName = lastName != null &&lastName.length()>1 ? lastName: "Default";
        this.gender = gender != null? gender: Gender.FEMALE;
        this.age = age>0 && age<=60? age: 18;
        this.department = department !=null && department.length()>1? department: "Administration";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public static enum Gender{
        MALE,FEMALE
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName()) && getGender() == person.getGender() && getDepartment().equals(person.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGender(), getAge(), getDepartment());
    }


}
