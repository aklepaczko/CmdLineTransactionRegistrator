package edu.mobile;

public abstract class Contractor {

   public enum ContractorType {
        PROVIDER,
        CUSTOMER
    }

    static int id = 0;

    private String name;
    private String industry;
    private ContractorType contractorType;  // 0 - buyer, 1 - provider
    private int contractorId;
    private int inStoreAmount;

    private boolean inTransaction = false;

    public Contractor() {

    }

    public Contractor(String name, String industry, ContractorType contractorType) {
        this.setName(name);
        this.setIndustry(industry);
        this.setContractorType(contractorType);
        setContractorId(++id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!inTransaction)
            this.name = name;
        else {
            System.out.println("Warning! Contractor is currently in transaction. Name not changed.");
        }
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public ContractorType getContractorType() {
        return contractorType;
    }

    public void setContractorType(ContractorType contractorType) {
        this.contractorType = contractorType;
    }

    public int getContractorId() {
        return contractorId;
    }

    public void setContractorId(int contractorId) {
        this.contractorId = contractorId;
    }

    public int getInStoreAmount() {
        return inStoreAmount;
    }

    public void setInStoreAmount(int inStoreAmount) {
        this.inStoreAmount = inStoreAmount;
    }

    public void setInTransaction(boolean inTransaction) {
        this.inTransaction = inTransaction;
    }

    public void makeOffer(String msg) {
        System.out.println(getName() + ": " + msg);
    }

    public void makeOffer(String msg, int numRepetitions) {
        for (int i=0; i < numRepetitions; i++) {
            System.out.println(getName() + ": " + msg);
        }
    }

    public void makeOffer(int numRepetitions) {
        for (int i=0; i < numRepetitions; i++) {
            makeOffer();
        }
    }

    public abstract void makeOffer();
/*
    {
        System.out.println("I'm ready for transaction.");
    }
*/


}
