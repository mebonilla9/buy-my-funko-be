package co.edu.umb.buymyfunkobe.business.mapper;

import co.edu.umb.buymyfunkobe.model.dto.ReviewDto;
import co.edu.umb.buymyfunkobe.model.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReviewMapper extends GenericMapper<Review, ReviewDto> {

  ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);
}
