package co.edu.umb.buymyfunkobe.model.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Table(name = "product")
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "title", nullable = false, length = 150)
  private String title;

  @Lob
  @Column(name = "description")
  private String description;

  @Column(name = "price", nullable = false, precision = 6, scale = 2)
  private BigDecimal price;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_category", nullable = false)
  private Category idCategory;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Product product = (Product) o;
    return Objects.equals(id, product.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}