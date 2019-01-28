package com.asaf;

public class Main {

    public static void main(String[] args) {
    Customer customer = new Customer("Asaf",1515);
    Customer newCustomer=customer;
    newCustomer.setBalance(15);     //Bunları bu şekilde eşlediğimiz zaman aynı adresi paylaşıyorlar
                                    //Bu sebepten balance ayarı değiştiğinde aslında ikisinin de değeri değişiyor.
        System.out.println("Name :"+customer.getName()+" Balance :"+customer.getBalance());

    }
}


public class Customer {
    private String name;
    private int balance;

    public Customer(String name,int balance){
        this.name=name;
        this.balance=balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
