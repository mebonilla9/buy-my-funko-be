package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.UserDto;
import co.edu.umb.buymyfunkobe.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper extends GenericMapper<User, UserDto> {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
}
