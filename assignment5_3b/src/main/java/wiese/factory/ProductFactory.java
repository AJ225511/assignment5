package wiese.factory;

import wiese.domain.Product;
import wiese.misc.Misc;

public class ProductFactory {
    public static Product getProduct(String courseName) {
        return new Product.Builder().productId(Misc.generateId())
                .productId(courseName)
                .build();
    }

}
