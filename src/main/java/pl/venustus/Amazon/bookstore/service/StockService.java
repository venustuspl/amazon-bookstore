package pl.venustus.Amazon.bookstore.service;

import org.springframework.stereotype.Service;
import pl.venustus.Amazon.bookstore.domain.Stock;
import pl.venustus.Amazon.bookstore.repo.StockRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Transactional
    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock updateStock(Stock stock) {
        Stock stockToUpdate = getStockById(stock.getId());
        stockToUpdate.setAddress(stock.getAddress());
        return stockToUpdate;
    }

    public Stock getStockById(Long id) {
        return stockRepository.findById(id).
                orElseThrow(() -> new NoSuchElementException("Stock with id: " + id + " not exists!"));
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Transactional
    public void deleteStock(Stock stock) {
        stockRepository.delete(stock);
    }
}
