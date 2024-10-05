package adapter;

public class AndroidToAppleChargerAdapter extends AppleCharger {
    private final AndroidCharger androidCharger;

    public AndroidToAppleChargerAdapter(AndroidCharger androidCharger) {

        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeApplePhones() {
        System.out.println("Você está usando um adaptador de android para Apple");
        androidCharger.chargeAndroidPhones();
    }
}