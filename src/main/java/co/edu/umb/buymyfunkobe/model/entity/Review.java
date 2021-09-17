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
@Table(name = "review")
@Entity
public class Review {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "score", nullable = false)
  private Integer score;

  @Column(name = "created_at", nullable = false)
  private Instant createdAt;

  @Lob
  @Column(name = "content", nullable = false)
  private String content;

  @Column(name = "likes")
  private Integer likes;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_user", nullable = false)
  private User idUser;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_product", nullable = false)
  private Product idProduct;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Review review = (Review) o;
    return Objects.equals(id, review.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}