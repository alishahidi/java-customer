package org.alishahidi;

import org.alishahidi.customer.Customer;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer("Ali Shahidi");
        customer.sellSomthing("Knife");
        customer.sellSomthing("Spry");

        System.out.println(customer.getProducts().toString());
    }
}
