package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.ImageProductDto;
import co.edu.umb.buymyfunkobe.model.entity.ImageProduct;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImageProductMapper extends GenericMapper<ImageProduct, ImageProductDto> {

  ImageProductMapper INSTANCE = Mappers.getMapper(ImageProductMapper.class);
}
