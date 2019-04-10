package wiese;
import wiese.domain.Product;
import org.junit.Assert;
import org.junit.Test;
import wiese.factory.ProductFactory;

import static org.junit.Assert.*;

public class ProductTest {
    @Test
    public void getCourse() {

        String name = "Beige Blinds";
        Product p = ProductFactory.getProduct(name);
        System.out.println(p);
        Assert.assertNotNull(p.getproductId());
    }
}

