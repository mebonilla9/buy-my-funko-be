package co.edu.umb.buymyfunkobe.model.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Table(name = "shipping")
@Entity
public class Shipping {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "sent_at", nullable = false)
  private Instant sentAt;

  @Column(name = "received_at", nullable = false)
  private Instant receivedAt;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_address", nullable = false)
  private Address idAddress;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_order_history", nullable = false)
  private OrderHistory idOrderHistory;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Shipping shipping = (Shipping) o;
    return Objects.equals(id, shipping.id);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}