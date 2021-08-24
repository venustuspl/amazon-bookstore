package pl.venustus.Amazon.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Map;

@Getter
@Setter
@ToString
@Entity
public class Stock {
    @Id
    @GeneratedValue
    private long id;
    private String address;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stock_book_mapping",
            joinColumns = {@JoinColumn(name = "stock_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")})
    @MapKey(name = "bookName")
    private Map<Integer, Book> bookMap;
}
