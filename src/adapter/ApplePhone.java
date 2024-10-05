package adapter;

public class ApplePhone {

    private AppleCharger charger;

    public void plugAppleCharger(AppleCharger charger) {
        System.out.println("Carregador conectado no Iphone");
        this.charger = charger;
    }

    public void charge() {
        System.out.println("Carregando Iphone");
        this.charger.chargeApplePhones();
    }
}