package bridge;


public class BigWheel extends Car {
    
    private final Product product;
    private final String carType;
    
    public BigWheel(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Montando " + product.productName() + " para " + carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modificando produto " + product.productName() + " de acordo com " + carType);
    }
}
