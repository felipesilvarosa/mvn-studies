package rosa.felipe.mapper;

import guru.springframework.domain.UserCommand;
import org.mapstruct.Mapper;
import rosa.felipe.entities.User;

@Mapper
public interface UserMapper {

    User userCommandToUser(UserCommand userCommand);
    UserCommand userToUserCommand(User user);
}
