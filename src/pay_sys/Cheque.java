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
public class Cheque implements PaymentModeAbstract {
    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount + " Rs. using cheque");
    }
}
