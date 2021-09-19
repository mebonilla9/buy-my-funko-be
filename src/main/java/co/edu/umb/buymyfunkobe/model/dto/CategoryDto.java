package co.edu.umb.buymyfunkobe.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

  private Integer id;
  private String name;
  private CategoryDto subCategory;
}
