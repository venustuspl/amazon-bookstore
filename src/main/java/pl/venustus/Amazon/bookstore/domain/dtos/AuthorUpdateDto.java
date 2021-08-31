package pl.venustus.Amazon.bookstore.domain.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthorUpdateDto {
    private String id;
    private String name;
    private String lastName;
}
