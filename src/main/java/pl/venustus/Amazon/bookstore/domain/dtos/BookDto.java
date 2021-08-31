package pl.venustus.Amazon.bookstore.domain.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDto {
    private String id;
    private String name;
    private String price;
    private String authorId;
}
