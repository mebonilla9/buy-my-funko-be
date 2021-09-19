package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.ImageDto;
import co.edu.umb.buymyfunkobe.model.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImageMapper extends GenericMapper<Image, ImageDto> {

  ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);
}
