package co.edu.umb.buymyfunkobe.model.dto;

import co.edu.umb.buymyfunkobe.model.entity.Product;
import co.edu.umb.buymyfunkobe.model.entity.User;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

  private Integer id;
  private Integer score;
  private Instant createdAt;
  private String content;
  private Integer likes;
  private UserDto user;
  private ProductDto product;
}
