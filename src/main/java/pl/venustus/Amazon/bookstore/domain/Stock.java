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
    long id;

    String address;

    @OneToMany
    @JoinColumn(name = "book_id")
    Map<Integer, Book> bookMap;
}
