package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.CategoryDto;
import co.edu.umb.buymyfunkobe.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper extends GenericMapper<Category, CategoryDto> {

  CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

}
