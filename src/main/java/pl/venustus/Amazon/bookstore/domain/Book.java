package pl.venustus.Amazon.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "name")
    private String bookName;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    Author author;
}
