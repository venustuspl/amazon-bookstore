package pl.venustus.Amazon.bookstore.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.venustus.Amazon.bookstore.domain.Book;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AuthorDto {
    private String id;
    private String name;
    private String lastName;
    private List<Book> bookList;
}
