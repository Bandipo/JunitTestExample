package service;

import exception.PersonNotFoundException;
import model.Person;

import java.util.*;
import java.util.logging.Logger;

public class VotersRegistrationPoint implements VotersRegistrationService {

    private final static  Queue<Person> personQueue = new LinkedList<>();
    private final static  Queue<Person> priorityQueue = new PriorityQueue<>(new Comparator<Person>() {

//        Comparator.comparingInt(Person::getPriority)
        @Override
        public int compare(Person person1, Person person2) {

            if(person1.getPriority()< person2.getPriority()){
                return -1;
            }else if(person1.getPriority()> person2.getPriority()){
                return 1;
            }else  {
                return 0;
            }
        }
    });

    private final static Set<Person> registeredPersons = new HashSet<>();

    private final static Logger LOGGER = Logger.getLogger(VotersRegistrationPoint.class.getName());



    public VotersRegistrationPoint() {
    }

    @Override
    public void registerForCard(Person person) {

        if(person != null){
            addPersonToQueue(person);

        }




    }

    private void addPersonToQueue(Person person) {
        if(!personQueue.contains(person)){
            personQueue.add(person);

        }

        if(!priorityQueue.contains(person)){
            priorityQueue.add(person);
        }
    }

    @Override
    public void registerPerson() {

        if(!personQueue.isEmpty()){

            final Person registeredPerson =
                    personQueue.remove();

            registeredPersons.add(registeredPerson);

            LOGGER.info(String.format("Registered:  %s ", registeredPerson.getName()));

        }



    }

    @Override
    public void registerPerson1() {

        if(!priorityQueue.isEmpty()){

            final Person registeredPerson =
                    priorityQueue.remove();

            registeredPersons.add(registeredPerson);

            LOGGER.info(String.format("Registered:  %s ", registeredPerson.getName()));

        }

    }

    @Override
    public void printRegisteredPersons() {

        registeredPersons.forEach(person -> {
            System.out.println(person);
        });

    }

    @Override
    public Person getPersonByName(String name) {

        // we return Empty Person if the  Person is not found by name
        Optional<Person> optionalPerson =Optional.empty();

        for( Person person : registeredPersons){

            if(person.getName().equalsIgnoreCase(name)){

                optionalPerson = Optional.of(person); // the value found is wrapped in optional
            }

        }


        // if the person is found, we get the person else we throw an exception

        final Person foundPerson = optionalPerson.orElseThrow(
                () -> new PersonNotFoundException("Person Not found")
        );


        return foundPerson;


    }

    @Override
    public Set<Person> getRegisteredPersons() {
        return registeredPersons;
    }
}
