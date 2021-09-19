package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.UserAddressDto;
import co.edu.umb.buymyfunkobe.model.entity.UserAddress;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserAddressMapper extends GenericMapper<UserAddress, UserAddressDto> {

  UserAddressMapper INSTANCE = Mappers.getMapper(UserAddressMapper.class);
}
