package singleton.singleton_as_enum;

public enum SingletonEnum {

    INSTANCE;

    private String value = "Enum is a great way to solve such singleton related issues as deserialization and accessing constructor via reflection";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
