package gift.converter;

import gift.domain.Product;
import gift.web.dto.request.CreateProductRequest;
import org.springframework.stereotype.Component;

/**
 * Converts a CreateProductRequest to a Product entity.
 */
@Component
public class ProductConverter {

    public Product convertToEntity(CreateProductRequest request) {
        return new Product.Builder()
            .name(request.getName())
            .price(request.getPrice())
            .imageUrl(request.getImageUrl())
            .build();
    }

}