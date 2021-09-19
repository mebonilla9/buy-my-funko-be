package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.ProductDto;
import co.edu.umb.buymyfunkobe.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper extends GenericMapper<Product, ProductDto>{

  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
}
