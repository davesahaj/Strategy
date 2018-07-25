package pay_sys;

/**
 *
 * @author dave
 * @date 23 July 2018
 * 
 * credit/debit card class
 */
public class CDcard extends Online {
    public CDcard(String nameOnCard, String number, String cvv, String expirationDate, String userName, String password) {
        super(nameOnCard, number, cvv, expirationDate, userName, password);
    }
    @Override
    protected String getType() {
        return "CDcard";
    }
    @Override
    protected void executeTransaction(int amount) {
        // bank stuff
    }
}
