package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.ShippingDto;
import co.edu.umb.buymyfunkobe.model.entity.Shipping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShippingMapper extends GenericMapper<Shipping, ShippingDto> {

  ShippingMapper INSTANCE = Mappers.getMapper(ShippingMapper.class);
}
