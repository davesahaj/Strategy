/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay_sys;
import java.text.MessageFormat;
/**
 *
 * @author dave
 */
public abstract class Online implements PaymentModeAbstract {

    private final String nameOnCard;
    private final String number;
    private final String cvv;
    private final String expirationDate;
    private final String userName;
    private final String password;
    

    public Online(String nameOnCard, String number, String cvv, String expirationDate, String userName, String password) {
        this.nameOnCard = nameOnCard;
        this.number = number;
        this.cvv = cvv;
        //When I wrote this, only God and I understood what I was doing
        //Now, God only knows
        this.expirationDate = expirationDate;
        this.userName = userName;
        this.password = password;
        
    }

    @Override
    public String toString() {
      //  if()
        {
        return MessageFormat.format("{0} Card[name = {1}, number = {2}, CVV = {3}, expiration = {4}, username = {5}, password = {6}]", getType(), nameOnCard, number, cvv, expirationDate,userName,password);
        }
        
     /*   else
        {
        return MessageFormat.format("{0} Wallet[username = {1}, password = {2}]", getType(),userName,password);
        }
     */  
        
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount + " Rs. using " + toString());
    }

    protected abstract String getType();

    protected abstract void executeTransaction(int amount);
}
