package co.edu.umb.buymyfunkobe.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

  private Integer id;
  private String address;
  private String city;
  private String region;
  private String zipCode;
  private String phone;
}
