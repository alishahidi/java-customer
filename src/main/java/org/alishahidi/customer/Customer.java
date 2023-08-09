package org.alishahidi.customer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
  private String name;
  private List<String> products;

  public void sellSomthing(String product) {
    products.add(product);
    System.out.println("Product: " + product + " selled to customer: " + name);
  }
}
