package ba.sum.fpmoz.javaapp.repositories;

import ba.sum.fpmoz.javaapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
