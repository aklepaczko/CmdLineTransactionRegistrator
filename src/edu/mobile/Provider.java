package edu.mobile;

public class Provider extends Contractor {

    public Provider(String name, String industry) {
        super(name, industry, ContractorType.PROVIDER);
    }

    public void provideGoods(int amount) {
        setInStoreAmount(getInStoreAmount() - amount);
    }

    @Override
    public void makeOffer() {
        System.out.println("I want to sell goods.");
    }
}
