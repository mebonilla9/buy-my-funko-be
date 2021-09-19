package co.edu.umb.buymyfunkobe.model.dto;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderHistoryDto {

  private Integer id;
  private Integer quantity;
  private BigDecimal totalPrice;
  private String products;
}
