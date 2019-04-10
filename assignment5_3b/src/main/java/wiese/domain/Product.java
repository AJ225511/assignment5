package wiese.domain;

public class Product {

    private String productId, productName;
    //private int productWidth, productHeight;

    private Product(){

    }

    private Product(Builder builder){
        this.productId=builder.productId;
        this.productName=builder.productName;
    }

    public String getproductId() {
        return productId;
    }

    public String getproductName() {
        return productName;
    }

    public static class Builder {

        private String productId, productName;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

        @Override
        public String toString() {
            return "Course{" +
                    "courseId='" + productId + '\'' +
                    ", courseName='" + productName + '\'' +
                    '}';

        }
    }
}

