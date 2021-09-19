package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.ShoppingCartDto;
import co.edu.umb.buymyfunkobe.model.entity.ShoppingCart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShoppingCartMapper extends GenericMapper<ShoppingCart, ShoppingCartDto> {

  ShoppingCartMapper INSTANCE = Mappers.getMapper(ShoppingCartMapper.class);
}
