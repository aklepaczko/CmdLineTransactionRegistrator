package edu.mobile;

public class Transaction {

    Contractor contractorA;
    Contractor contractorB;

    String status;  // -1 - on creation, 0 - negotiations, 1 - in progress, 2 - completed

    // TODO: napisać konstruktor z 2 parametrami (kontrahenci)
    public Transaction() {

    }

    public void checkValidity() {
        // TODO: check if contractors industry is the same
        // TODO: check if provider has enough goods to sell
        // if ok: set status to 0
    }

    public void initTransaction() {
        // set status to 1
    }

    public void completeTransaction() {
        // set status to 2
    }
}
