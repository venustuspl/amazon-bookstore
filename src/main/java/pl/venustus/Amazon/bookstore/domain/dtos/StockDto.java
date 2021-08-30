package pl.venustus.Amazon.bookstore.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class StockDto {
    private String id;
    private String address;
}
