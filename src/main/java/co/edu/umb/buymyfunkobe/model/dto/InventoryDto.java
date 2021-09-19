package co.edu.umb.buymyfunkobe.model.dto;

import co.edu.umb.buymyfunkobe.model.entity.Product;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDto {

  private Integer id;
  private Integer quantity;
  private Instant updatedAt;
  private Product product;
}
