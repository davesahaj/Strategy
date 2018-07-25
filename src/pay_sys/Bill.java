/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay_sys;
import java.util.*;
/**
 *
 * @author dave
 */
public class Bill {
     private List<LineItem> lineItems = new ArrayList<>();
    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }
    public void removeLineItem(LineItem lineItem) {
        lineItems.remove(lineItem);
    }
    public int getCostInCents() {
        return lineItems.stream().mapToInt(item -> item.getCostInCents()).sum();
    }
    public void pay(PaymentMode method) {
        method.pay(getCostInCents());
    }
}
