package pl.venustus.Amazon.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.venustus.Amazon.bookstore.domain.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
