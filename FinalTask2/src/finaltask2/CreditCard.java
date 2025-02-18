/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltask2;

/**
 *
 * @author macproavid
 */
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner,Money creditLimit){
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);

    }
    public Money getBalance(){
        return new Money(this.balance);
    }
    public Money getCreditLimit(){
        return new Money(this.creditLimit);
    }
    public String getPersonals(){
        return owner.toString();
    }
    public void charge(Money amount){
        if (balance.add(amount).compareTo(creditLimit)>0){
            System.out.println("Exceeds credit limit");
        }
        else{
            balance = balance.add(amount);
            System.out.println("Charge" + amount.toString());
        }
    }
    public void payment(Money amount){
        balance = balance.subtract(amount);
        System.out.println("Payment:" + amount.toString());
    }
}