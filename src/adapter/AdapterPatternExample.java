package adapter;

public class AdapterPatternExample {
	public static void main(String[] args) {
		ApplePhone applePhone = new ApplePhone();
		AndroidCharger androidCharger = new AndroidCharger();
		System.out.println("Criado um Iphone e um carregador de android");
		AppleCharger androidToAppleChargerAdapter = new AndroidToAppleChargerAdapter(androidCharger); 
		System.out.println("Criado um carregador da Apple que foi convertido por um carregador android");
		applePhone.plugAppleCharger(androidToAppleChargerAdapter);
		applePhone.charge();
	}
}