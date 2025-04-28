package app.ariidjs.order_service.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public record OrderRequest(Long id,
                           String orderNumber,
                           UserDetails userDetails,
                           String skuCode,
                           BigDecimal price,
                           Integer quantity) {
    public record UserDetails(String email, String firstName, String lastName){}
}
