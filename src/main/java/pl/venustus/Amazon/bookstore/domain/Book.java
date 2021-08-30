package pl.venustus.Amazon.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;


@NamedQueries({
        @NamedQuery(name = "Book.FindAllExpensiveBooks",
                query = "FROM BOOK WHERE PRICE > 100"),
        @NamedQuery(name = "Book.FindAllCheapBooks",
                query = "FROM BOOK WHERE PRICE <= 100")
})

@Getter
@Setter
@ToString
@Entity(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;
    private String name;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    Author author;
}
