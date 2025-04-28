package app.ariidjs.product_service.dto;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductRequest {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
