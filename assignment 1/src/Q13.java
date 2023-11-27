public class Q13 {
    CreditCard[] wallet;

    {
        wallet = new CreditCard[3];
        for (int val = 1; val <=3 ; val++) {
            wallet[0].charge(val*1000);
            wallet[1].charge(2 * val);
            wallet[2].charge(val * 10);
        }
    }
    class CreditCard{
       int val;
    }
}
