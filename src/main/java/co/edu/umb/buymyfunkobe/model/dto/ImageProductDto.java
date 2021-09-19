package co.edu.umb.buymyfunkobe.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImageProductDto {

  private Integer id;
  private ImageDto image;
  private ProductDto product;
}
