package builder.inner_builder_impl;

import builder.abstract_builder_impl.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {

    private String name;
    private String age;
    private String address;

    private UserDTO() {

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.join("\n", name, age, address);
    }

    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO dto;

        private UserDTOBuilder() {

        }

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate birthday) {
            Period ageInYears = Period.between(birthday, LocalDate.now());
            this.age = Integer.toString(ageInYears.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = String.join("\n", address.getHouseNumber(), address.getStreet(), address.getCity(),
                    address.getCountry(), address.getPostalCode());
            return this;
        }

        public UserDTO build() {
            dto = new UserDTO();
            dto.setName(String.format("%s %s", this.firstName, this.lastName));
            dto.setAge(this.age);
            dto.setAddress(this.address);
            return dto;
        }

        public UserDTO fetchLastUserDTO() {
            return dto;
        }
    }
}
