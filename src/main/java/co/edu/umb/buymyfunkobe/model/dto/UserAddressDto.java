package co.edu.umb.buymyfunkobe.model.dto;

import co.edu.umb.buymyfunkobe.model.entity.Address;
import co.edu.umb.buymyfunkobe.model.entity.User;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressDto {

  private Integer id;
  private User user;
  private Address address;
}
