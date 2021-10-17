import exceptions.NameNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUnitExample implements JUnitTestable {

    private List<String> names ;

    public JUnitExample() {
        names = new ArrayList<>();
    }

    public int divideTwoNumbers(final int num1, final int num2){

        //validate our input
        if(num2 == 0) throw new IllegalArgumentException("num2 cannot be zero");
        return num1/ num2;
    }


    public String convertAStringToUpperCase(final String word){

        //validate our input
            if(word == null || word.isEmpty()) throw new IllegalArgumentException("input must not be null or empty");
        return word.toUpperCase();

    }


    public void addNamesToACollection(final String name){
        names.add(name);
    }

    public boolean findANameInACollection(final String name){


        boolean returnType = false;

        if(!name.isEmpty() &&  name.length()> 1){

            if(names.contains(name)){
                returnType = true;
            }else {
                throw new NameNotFoundException("Name not found");
            }

        }

        return returnType;
    }

    public void printNames(){
        if(names == null) throw new NullPointerException("List is Empty");
        names.forEach(System.out::println);
    }

    public List<String> getNames(){
        return this.names;
    }






}
