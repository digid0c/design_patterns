package builder.abstract_builder_impl;

import java.time.LocalDate;
import java.time.Period;

public class UserViewDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserViewDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears = Period.between(birthday, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = String.join("\n", address.getHouseNumber(), address.getStreet(), address.getCity(),
                address.getCountry(), address.getPostalCode());
        return this;
    }

    @Override
    public UserDTO build() {
        this.dto = new UserViewDTO(String.format("%s %s", this.firstName, this.lastName), this.age, this.address);
        return this.dto;
    }

    @Override
    public UserDTO fetchLastUserDTO() {
        return this.dto;
    }
}
