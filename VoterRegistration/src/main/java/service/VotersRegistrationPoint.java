package service;

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

//    @Override
//    public Person getPersonByName(String name) {
//
//        Person returnValue  = new Person();
//
//        registeredPersons.forEach(person -> {
//            if(person.getName().equalsIgnoreCase(name)){
//               Optional<Person>  foundPersonOptional  = Optional.of(person);
//
////               returnValue = foundPersonOptional.get();
//
//
//            }
//        });
//
//
//    }

    @Override
    public Set<Person> getRegisteredPersons() {
        return registeredPersons;
    }
}
