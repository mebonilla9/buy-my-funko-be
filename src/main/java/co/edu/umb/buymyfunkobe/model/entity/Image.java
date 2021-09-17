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
@Table(name = "image")
@Entity
public class Image {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "url", nullable = false)
  private String url;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Image image = (Image) o;
    return Objects.equals(id, image.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}