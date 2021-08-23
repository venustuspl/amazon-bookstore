package pl.venustus.Amazon.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AuthorDto {
    private long id;
    private String name;
    private String lastName;
    private List<Book> bookList;
}
