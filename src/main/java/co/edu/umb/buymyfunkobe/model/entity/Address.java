package co.edu.umb.buymyfunkobe.model.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "address")
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "address", nullable = false, length = 150)
  private String address;

  @Column(name = "city", nullable = false, length = 30)
  private String city;

  @Column(name = "region", nullable = false, length = 60)
  private String region;

  @Column(name = "zip_code", nullable = false, length = 10)
  private String zipCode;

  @Column(name = "phone", nullable = false, length = 20)
  private String phone;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Address address = (Address) o;
    return Objects.equals(id, address.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}