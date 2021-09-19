package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.OrderHistoryDto;
import co.edu.umb.buymyfunkobe.model.entity.OrderHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderHistoryMapper extends GenericMapper<OrderHistory, OrderHistoryDto>{

  OrderHistoryMapper INSTANCE = Mappers.getMapper(OrderHistoryMapper.class);
}
