package pl.venustus.Amazon.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Entity(name = "AUTHOR")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private long id;
    private String name;
    private String lastName;
    @OneToMany(mappedBy = "author")
    private List<Book> bookList;

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class StockDto {
        private String id;
        private String name;
        private String address;
        private List<Book> bookList;
    }
}
