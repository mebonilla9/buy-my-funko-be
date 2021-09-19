package co.edu.umb.buymyfunkobe.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

  private Integer id;
  private String name;
  private String email;
  private String password;
  private Boolean enable;

}
