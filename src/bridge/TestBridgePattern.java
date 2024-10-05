package bridge;

public class TestBridgePattern {

    public static void main(String[] args) {
        Product product = new CentralLocking("Sistema de Trava Central");
        Product product2 = new GearLocking("Sistema de Trava de Marcha");
        
        Car car = new BigWheel(product, "Modelo BigWheel xz");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        
        System.out.println();
        
        car = new BigWheel(product2, "Modelo BigWheel xz");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        
        System.out.println("-----------------------------------------------------");
        
        car = new Motoren(product, "Modelo Motoren lm");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        
        System.out.println();
        
        car = new Motoren(product2, "Modelo Motoren lm");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}
