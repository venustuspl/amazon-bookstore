package pl.venustus.Amazon.bookstore.domain.dtos;

import lombok.*;
import pl.venustus.Amazon.bookstore.domain.Book;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthorDto {
    private String id;
    private String name;
    private String lastName;
    private List<Book> bookList;
}
