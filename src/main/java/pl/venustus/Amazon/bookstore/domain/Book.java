package pl.venustus.Amazon.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Entity
public class Book {
    @Id
    long id;

    String name;

    String author;

    BigDecimal price;
}
