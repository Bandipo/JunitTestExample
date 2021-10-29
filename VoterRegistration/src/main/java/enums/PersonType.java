package enums;

public enum PersonType {
    ELDERLY_PERSON(1),
    PREGNANT_PERSON(2),
    OTHERS(3);

    private int priority;

    PersonType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
