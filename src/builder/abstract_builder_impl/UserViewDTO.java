package builder.abstract_builder_impl;

public class UserViewDTO implements UserDTO {

    private String name;
    private String age;
    private String address;

    public UserViewDTO(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.join("\n", name, age, address);
    }
}
