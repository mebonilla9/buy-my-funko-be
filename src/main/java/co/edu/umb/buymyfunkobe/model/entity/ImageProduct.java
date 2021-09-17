package co.edu.umb.buymyfunkobe.model.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Table(name = "image_product")
@Entity
public class ImageProduct {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_image", nullable = false)
  private Image idImage;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_product", nullable = false)
  private Product idProduct;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    ImageProduct that = (ImageProduct) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}