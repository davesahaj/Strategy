/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay_sys;

/**
 *
 * @author dave
 * 
 */
public class Paypal extends Online {
    public Paypal(String nameOnCard, String number, String cvv, String expirationDate, String userName, String password) {
        super(nameOnCard, number, cvv, expirationDate, userName, password);
    }
    // I dedicate all this code, all my work, to the game, Super Mario Bros., who will 
// have to support me from dealing with low grades and depression once it gets 
// presented in IBPP.
    @Override
    protected String getType() {
        return "Paypal";
    }
    @Override
    protected void executeTransaction(int cents) {
        // Contact bank to execute transaction
    }
}
