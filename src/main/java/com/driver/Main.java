package com.driver;

public class Main {
  public static void main(String[] args) {
    
    RWOnly obj = new RWOnly();

    // obj.data = 10;
    //  The field RWOnly.data is not visible

    // setting value 10 
    obj.setter(10);

    // getting the data back
    System.out.println(obj.getter());
  }
}