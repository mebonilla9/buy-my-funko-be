package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.AddressDto;
import co.edu.umb.buymyfunkobe.model.entity.Address;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper extends GenericMapper<Address, AddressDto>{

  AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
}
