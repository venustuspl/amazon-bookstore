package pl.venustus.Amazon.bookstore.service;

import org.springframework.stereotype.Service;
import pl.venustus.Amazon.bookstore.domain.Book;
import pl.venustus.Amazon.bookstore.repo.BookRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Transactional
    public void deletebook(Book book) {
        bookRepository.delete(book);
    }

    public Book updatebook(Book book) {
        Book bookForUpdate = getBookById(book.getId());
        bookForUpdate.setName(book.getName());
        bookForUpdate.setAuthor(book.getAuthor());
        bookForUpdate.setPrice(book.getPrice());

        return bookRepository.save(bookForUpdate);
    }

    public Book getBookById(Long bookId) {
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new NoSuchElementException("Book with id: " + bookId + " not exists!"));
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
