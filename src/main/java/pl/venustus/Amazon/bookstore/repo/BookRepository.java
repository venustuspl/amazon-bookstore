package pl.venustus.Amazon.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.venustus.Amazon.bookstore.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
