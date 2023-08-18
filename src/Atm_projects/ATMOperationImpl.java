package Atm_projects;
import java.util.*;

public class ATMOperationImpl{
   ATM atm=new ATM();
   Map<Double,String>ministmt=new HashMap<>();
    public void viewBalance() {
        System.out.println("Availabe Balance :" +atm.getBalance()+"$");
    }


    public void depositAmount(double depositAmt) {
        System.out.println(depositAmt+"$ is Deposited");
        ministmt.put(depositAmt,"Amount deposited");
        atm.setDeposiAmount(depositAmt);
        atm.setBalance(atm.getBalance()+ atm.getDeposiAmount());
        viewBalance();

    }


    public void widthrawAmount(double widthAmt) {
        if (atm.getBalance() > widthAmt) {
            ministmt.put(widthAmt,"Amount Widthrawn");
            System.out.println("collect the Amount : "+widthAmt);
            atm.setBalance(atm.getBalance() -widthAmt);
            viewBalance();
        }
        else{
            System.out.println("Insuffient Balance");
        }
    }


    public void MiniStatement() {
        for(Map.Entry<Double,String>m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
