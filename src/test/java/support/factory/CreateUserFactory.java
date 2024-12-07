package support.factory;

import com.github.javafaker.Faker;
import support.dto.UserDTO;

public class CreateUserFactory {

    public static UserDTO createFactoryUser(){
        Faker faker = new Faker();
        UserDTO userDTO = new UserDTO();
        userDTO.setFullName(faker.gameOfThrones().character());
        userDTO.setEmail(faker.internet().emailAddress());
        userDTO.setCurrentAddress(faker.address().fullAddress());
        userDTO.setPermanentAddress(faker.gameOfThrones().city());
        return userDTO;
    }

}
