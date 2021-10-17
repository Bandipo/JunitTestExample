import java.util.List;

public interface JUnitTestable {

    int divideTwoNumbers(final int num1, final int num2);
    String convertAStringToUpperCase(final String word);
    boolean findANameInACollection(final String name);
    void printNames();
    List<String> getNames();
    void addNamesToACollection(final String name);
}
