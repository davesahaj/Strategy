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
public class LineItem {
     private String description;
    private int costInCents;
    public LineItem(String description, int costInCents) {
        this.description = description;
        this.costInCents = costInCents;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getCostInCents() {
        return costInCents;
    }
    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }
}
