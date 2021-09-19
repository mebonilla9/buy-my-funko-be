package co.edu.umb.buymyfunkobe.model.dto;

import co.edu.umb.buymyfunkobe.model.entity.Address;
import co.edu.umb.buymyfunkobe.model.entity.OrderHistory;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShippingDto {

  private Integer id;
  private Instant sentAt;
  private Instant receivedAt;
  private Address address;
  private OrderHistory orderHistory;
}
