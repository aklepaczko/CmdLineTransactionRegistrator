package edu.mobile;

public class RegistrationController {

    public static void main(String[] args) {

        Provider provider = new Provider("Microsoft", "Software");
        System.out.println("Seller id is " + provider.getContractorId());

        Customer customer = new Customer("Apple", "Computers");
        System.out.println("Buyer id is " + customer.getContractorId());

        customer.makeOffer();

        provider.makeOffer(5);

        Transaction t = new Transaction(provider, customer, Transaction.Status.ON_NEGATIATIONS);

        provider.setName("New Microsoft");

    }

}