package pl.venustus.Amazon.bookstore.service;

import org.springframework.stereotype.Service;
import pl.venustus.Amazon.bookstore.domain.Author;
import pl.venustus.Amazon.bookstore.repo.AuthorRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Transactional
    public void deleteAuthor(Author author) {
        authorRepository.delete(author);
    }

    public Author updateAuthor(Author author) {
        Author authorForUpdate = getAuthorById(author.getId());
        authorForUpdate.setName(author.getName());
        authorForUpdate.setName(author.getLastName());
        return authorRepository.save(authorForUpdate);
    }

    public Author getAuthorById(Long authorId) {
        return authorRepository.findById(authorId)
                .orElseThrow(() -> new NoSuchElementException("Author with id: " + authorId + " not exists!"));
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
