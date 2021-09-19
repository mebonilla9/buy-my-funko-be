package co.edu.umb.buymyfunkobe.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartDto {

  private Integer id;
  private Integer quantity;
  private BigDecimal totalPrice;
  private ProductDto product;
  private UserDto user;
}
