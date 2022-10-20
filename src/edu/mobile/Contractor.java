package edu.mobile;

public class Contractor {

    String name;
    static int id = 0;
    String industry;
    int contractorType;  // 0 - buyer, 1 - provider
    int contractorId;

    int inStoreAmount;

    public Contractor(String name, String industry, int contractorType) {
        this.name = name;
        this.industry = industry;
        this.contractorType = contractorType;
        contractorId = ++id;
    }

    public void provideGoods(int amount) {
        inStoreAmount -= amount;
    }

    public void receiveGoods(int amount) {
        inStoreAmount += amount;
    }
}
