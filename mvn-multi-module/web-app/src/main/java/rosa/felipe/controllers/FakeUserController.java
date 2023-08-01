package rosa.felipe.controllers;

import guru.springframework.domain.UserCommand;
import rosa.felipe.entities.User;
import rosa.felipe.mapper.UserMapper;
import rosa.felipe.mapper.UserMapperImpl;

public class FakeUserController {

    //fake method to multi module sample
    UserCommand saveUser(User user) {
        UserMapper userMapper = new UserMapperImpl();
        return userMapper.userToUserCommand(user);
    }
}
