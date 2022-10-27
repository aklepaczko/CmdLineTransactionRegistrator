package edu.mobile;

public class Transaction {

    Contractor contractorA;
    Contractor contractorB;

    public static final int UNCONFIRMED = -1;
    public static final int ON_NEGATIATIONS = 0;

    public enum Status {
        UNCONFIRMED,
        ON_NEGATIATIONS,
        IN_PROGRESS,
        COMPLETED,
    }

    Status status;

    public Transaction(Contractor provider, Contractor customer) {
        contractorA = provider;
        contractorB = customer;
        if (checkValidity()) {
            status = Status.ON_NEGATIATIONS;
            provider.setInTransaction(true);
            customer.setInTransaction(true);
        }
        else
            status = Status.UNCONFIRMED;
    }

    public Transaction(Contractor provider, Contractor customer, Status status) {
        contractorA = provider;
        contractorB = customer;
        provider.setInTransaction(true);
        customer.setInTransaction(true);
        this.status = status;
    }

    private boolean checkValidity() {
        return contractorA.getIndustry().equalsIgnoreCase(contractorB.getIndustry());
    }

    public void initTransaction() {
        // set status to 1
    }

    public void completeTransaction() {
        // set status to 2
    }

    // TODO: set quantity of goods in transaction
}
