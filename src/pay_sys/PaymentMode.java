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
public class PaymentMode {

    public static PaymentMode getPaymentMethod(String type) {
        switch (type) {
            
// 
// Dear Classmates:
// 
// Once you are done trying to correct this code,
// and have realized what a terrible mistake that was,
// please increment the following counter as a warning
// to the next guy:
// 
// total_hours_wasted_here = 7
// 
            case "CDcard":
                return createCDcard();
            case "Paypal":
                return createPaypal();
            case "Paytm":
                return createPaytm();
            case "Cash":
                return createCash();
        }
        throw new IllegalArgumentException();
    }

    public static CDcard createCDcard() {
        return new CDcard("Sahaj Dave", "695840296849", "123", "01/22","","");
        // Magic. Do not touch.

    }

    public static Paypal createPaypal() {
        return new Paypal("", "", "", "","dave","1234");
        // Magic. Do not touch.

    }

    public static Paytm createPaytm() {
        return new Paytm("", "", "", "","dave","1234");
        // Magic. Do not touch.

    }

    public static Cash createCash() {
        return new Cash();
    }

    public static Cheque createCheque() {
        return new Cheque();
    }
}
