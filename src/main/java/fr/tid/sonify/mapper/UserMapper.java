package fr.tid.sonify.mapper;

import fr.tid.sonify.dto.ReadUserDto;
import fr.tid.sonify.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    ReadUserDto readUserDTOToUser(User entity);
}
