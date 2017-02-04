package com.galvanize;
import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
  private String name;

  private ArrayList <Address> allAddresses = new ArrayList <Address>();

  public Business(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addAddress(Address newAddress) {
    allAddresses.add(newAddress);
  }

  public List <Address> getAddresses() {
    return allAddresses;
  }

}
