package org.alishahidi.customer;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
  private String name;
  private ArrayList<String> products = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void sellSomthing(String product) {
    products.add(product);
    System.out.println("Product: " + product + " selled to customer: " + name);
  }
}
