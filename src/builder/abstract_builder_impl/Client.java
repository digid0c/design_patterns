package builder.abstract_builder_impl;

import java.time.LocalDate;
import java.time.Month;

public class Client {

    public static void main(String[] args) {
        UserViewDTOBuilder builder = new UserViewDTOBuilder();
        System.out.println(build(builder, createUser()));
        System.out.println("------------------");
        System.out.println(builder.fetchLastUserDTO());
    }

    private static UserDTO build(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthDay())
                .withAddress(user.getAddress())
                .build();
    }

    private static User createUser() {
        User user = new User();
        user.setFirstName("Alan");
        user.setLastName("Marigold");
        user.setBirthDay(LocalDate.of(1985, Month.APRIL, 1));

        Address address = new Address();
        address.setHouseNumber("45");
        address.setStreet("Brighton Beach");
        address.setCity("New York");
        address.setCountry("USA");
        address.setPostalCode("123456");

        user.setAddress(address);
        return user;
    }
}
