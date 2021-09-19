package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.InventoryDto;
import co.edu.umb.buymyfunkobe.model.entity.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InventoryMapper extends GenericMapper<Inventory, InventoryDto> {

  InventoryMapper INSTANCE = Mappers.getMapper(InventoryMapper.class);
}
