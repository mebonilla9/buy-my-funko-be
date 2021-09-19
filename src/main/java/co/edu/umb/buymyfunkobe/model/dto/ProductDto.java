package co.edu.umb.buymyfunkobe.model.dto;

import co.edu.umb.buymyfunkobe.model.entity.Category;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

  private Integer id;
  private String title;
  private String description;
  private BigDecimal price;
  private Category category;
}
