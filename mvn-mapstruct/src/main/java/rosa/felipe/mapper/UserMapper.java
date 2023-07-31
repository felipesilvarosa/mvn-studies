package rosa.felipe.mapper;

import org.mapstruct.Mapper;
import rosa.felipe.domain.User;
import rosa.felipe.domain.UserCommand;

@Mapper
public interface UserMapper {

    User userCommandToUser(UserCommand userCommand);
    UserCommand userToUserCommand(User user);
}
