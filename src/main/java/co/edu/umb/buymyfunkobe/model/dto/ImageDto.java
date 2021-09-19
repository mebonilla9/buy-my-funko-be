package co.edu.umb.buymyfunkobe.model.dto;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImageDto {

  private Integer id;
  private String url;
}
