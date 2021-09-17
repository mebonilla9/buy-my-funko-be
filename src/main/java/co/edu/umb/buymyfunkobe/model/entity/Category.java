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
@Table(name = "category")
@Entity
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "name", nullable = false, length = 50)
  private String name;

  @ManyToOne
  @JoinColumn(name = "id_subcategory")
  private Category idSubcategory;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Category category = (Category) o;
    return Objects.equals(id, category.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}