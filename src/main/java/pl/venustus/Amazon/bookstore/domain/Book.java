package pl.venustus.Amazon.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Entity
public class Book {
    @Id
    long id;

    String name;

    BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "author_id")
    Author author;
}
