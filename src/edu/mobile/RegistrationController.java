package edu.mobile;

public class RegistrationController {

    public static void main(String[] args) {

        Contractor seller = new Contractor("Microsoft", "Software", 1);
        System.out.println("Seller id is " + seller.contractorId);

        Contractor buyer = new Contractor("Apple", "Computers", 0);
        System.out.println("Buyer id is " + buyer.contractorId);
    }

}