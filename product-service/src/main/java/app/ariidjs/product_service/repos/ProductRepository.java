package app.ariidjs.product_service.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.ariidjs.product_service.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}
