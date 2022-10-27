package edu.mobile;

public class Customer extends Contractor {

    public Customer(String name, String industry) {
        super(name, industry, ContractorType.CUSTOMER);
    }

    public void receiveGoods(int amount) {
        setInStoreAmount(getInStoreAmount() + amount);
    }

    @Override
    public void makeOffer() {
//        super.makeOffer();
        System.out.println("I want to buy goods.");
    }
}
