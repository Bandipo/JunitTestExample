package service;

import model.Person;

import java.util.Optional;
import java.util.Set;

public interface VotersRegistrationService {
   void  registerForCard(Person person);
   void registerPerson();
   void registerPerson1();
   void printRegisteredPersons();

   Person  getPersonByName(final String name);

   Set<Person> getRegisteredPersons();
}
