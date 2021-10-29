import enums.PersonType;
import model.Person;
import service.VotersRegistrationPoint;
import service.VotersRegistrationService;

import java.util.Set;

public class App {

    public static void main(String[] args) {

        Person other1 = new Person("kabir", PersonType.OTHERS);
        Person other2 = new Person("Paul", PersonType.OTHERS);
        Person elder = new Person("Grand pa", PersonType.ELDERLY_PERSON);
        Person pregnantWoman = new Person("Mummy Great", PersonType.PREGNANT_PERSON);


        VotersRegistrationService registrationService = new VotersRegistrationPoint();

        registrationService.registerForCard(other1);
        registrationService.registerForCard(other2);
        registrationService.registerForCard(elder);
        registrationService.registerForCard(pregnantWoman);


//        registrationService.registerPerson();
//        registrationService.registerPerson();
//        registrationService.registerPerson();
//        registrationService.registerPerson();


        registrationService.registerPerson1();
        registrationService.registerPerson1();
        registrationService.registerPerson1();
        registrationService.registerPerson1();


//        registrationService.printRegisteredPersons();






    }
}
