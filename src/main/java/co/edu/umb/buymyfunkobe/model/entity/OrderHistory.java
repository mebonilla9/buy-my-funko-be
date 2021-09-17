package co.edu.umb.buymyfunkobe.model.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Table(name = "order_history")
@TypeDef(name = "json", typeClass = JsonType.class)
@Entity
public class OrderHistory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "total_price", nullable = false, precision = 7, scale = 2)
  private BigDecimal totalPrice;

  @Type(type = "json")
  @Column(name = "products", nullable = false, columnDefinition = "jsonb")
  private String products;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    OrderHistory that = (OrderHistory) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}