package model;

import enums.PersonType;

import java.util.Objects;

public class Person {

    private final String name;
    private final PersonType personType;
    private int priority;

    public Person(String name, PersonType personType) {
        this.name = name != null && name.length() > 3? name : "Default Name";
        this.personType = personType != null ?  personType : PersonType.ELDERLY_PERSON;
        setPriority();
    }



    private void setPriority(){
        if(personType == PersonType.ELDERLY_PERSON){
            this.priority = PersonType.ELDERLY_PERSON.getPriority();
        }else if(personType == PersonType.PREGNANT_PERSON){
            this.priority = PersonType.PREGNANT_PERSON.getPriority();
        }else{
            this.priority = PersonType.OTHERS.getPriority();
        }
    }

    public String getName() {
        return name;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return priority == person.priority && getName().equals(person.getName()) && getPersonType() == person.getPersonType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPersonType(), priority);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personType=" + personType +
                '}';
    }
}
