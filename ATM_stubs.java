package myfirstproject;
public class ATM_stubs {
    int balance =1000;
    public boolean Check( int depositAmount){
        if (balance> depositAmount)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
