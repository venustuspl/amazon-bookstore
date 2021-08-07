package pl.venustus.Amazon.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Author {
    @Id
    long id;

    String name;

    String lastName;

    @OneToMany
    List<Book> bookList;
}
