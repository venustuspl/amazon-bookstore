package pl.venustus.Amazon.bookstore.mapper;

import org.springframework.stereotype.Component;
import pl.venustus.Amazon.bookstore.domain.Author;
import pl.venustus.Amazon.bookstore.domain.dtos.AuthorDto;
import pl.venustus.Amazon.bookstore.service.AuthorService;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AuthorMapper {
    private final AuthorService authorService;

    public AuthorMapper(AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author mapAuthorDtoToAuthor(AuthorDto authorDto) {
        Author author = new Author();
        author.setName(authorDto.getName());
        author.setLastName(authorDto.getLastName());

        return author;
    }

    public AuthorDto mapAuthorToAuthorDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId().toString());
        authorDto.setName(author.getName());
        authorDto.setLastName(author.getLastName());

        return authorDto;
    }

    public List<AuthorDto> mapAllAuthorsToAuthorsDtoList() {
        return authorService.getAllAuthors().stream()
                .map(this::mapAuthorToAuthorDto)
                .collect(Collectors.toList());
    }
}
