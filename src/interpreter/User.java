package interpreter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {

    private String name;
    private List<String> permissions;

    public User(String name, String ... permissions) {
        this.name = name;
        this.permissions = Stream.of(permissions)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, permissions);
    }
}
