public class Q12 {
    public class CreditCard {
        private String customer;
        private String bank;
        private String account;
        private int limit;
        private double balance;
        public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
            customer = cust;
            bank = bk;
            account = acnt;
            limit = lim;
            balance = initialBal;
        }
        public String getCustomer() {
            return customer;
        }
        public String getBank() {
            return bank;
        }
        public String getAccount() {
            return account;
        }
        public int getLimit() {
            return limit;
        }
        public double getBalance() {
            return balance;
        }
        public boolean charge(double price) {
            if (price + balance > limit)
                return false;
            balance += price;
            return true;
        }
        public void makePayment(double amount) {
            if (amount>=0){
                balance -= amount;
            }
        }
    }
}
