/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay_sys;

/**
 *
 * @author dave
 */
public class Paytm extends Online {
    public Paytm(String nameOnCard, String number, String cvv, String expirationDate, String userName, String password) {
        super(nameOnCard, number, cvv, expirationDate, userName, password);
    }
    @Override
    protected String getType() {
        return "Paytm";
    }
    @Override
    protected void executeTransaction(int amount) {
        // Contact bank to execute transaction
    }
}
