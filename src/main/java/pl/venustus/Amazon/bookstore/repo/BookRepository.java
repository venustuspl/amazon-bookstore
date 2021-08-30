package pl.venustus.Amazon.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.venustus.Amazon.bookstore.domain.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query
    List<Book> findAllExpensiveBooks();

    @Query
    List<Book> findAllCheapBooks();
}
