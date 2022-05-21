package myfirstproject;
public class ATM {
    public static int withdraw( int withdrawAmount)
    {
        System.out.println( "performing with draw :" );
        System.out.println("The withdrawing Amount is : " + withdrawAmount);
        ATM_stubs atm_s = new ATM_stubs();
        boolean accepted = atm_s.Check(withdrawAmount);
        if (accepted== true) {
            int balance = atm_s.balance - withdrawAmount;
            System.out.println( " finished ...tap remove the card" );
            System.out.println("your balance is"+ balance );
            return 1;
        }
        else {
            System.out.println( "error balance is insufficient." );
            return 0;
        }
    }
    public static int deposit(int balance, int depositAmount)
    {
        System.out.println( " performing Deposit Operation :" );
        System.out.println(" your deposit amount is : " + depositAmount);
        balance = balance + depositAmount;
        System.out.println( "Your Money has been successfully deposited!!" );
        System.out.println("your balance is"+ balance);
        return balance;
    }
}
