package co.edu.umb.buymyfunkobe.model.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "inventory")
@Entity
public class Inventory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "updated_at", nullable = false)
  private Instant updatedAt;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_product", nullable = false)
  private Product idProduct;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Inventory inventory = (Inventory) o;
    return Objects.equals(id, inventory.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}