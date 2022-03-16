import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    record Product(String name, BigDecimal price) {}

    public static void main(String[] args) {
        var products = List.of(
                new Product("A", new BigDecimal("100")),
                new Product("B", new BigDecimal("200")),
                new Product("C", new BigDecimal("150")),
                new Product("D", new BigDecimal("130")),
                new Product("E", new BigDecimal("200"))
        );


    }
}
