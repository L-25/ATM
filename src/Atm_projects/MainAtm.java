package Atm_projects;

import java.util.Scanner;

public class MainAtm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATMOperationImpl op=new ATMOperationImpl();
        int Atm_No=12345;
        int pin=1234;
        System.out.print("Enter the Atm number : ");
        int num= sc.nextInt();
        System.out.print("Enter the Pin number : ");
        int pin_no= sc.nextInt();
        if(Atm_No==num && pin_no==pin){
            while(true){
                System.out.println("1.View Available Balance\n2.Deposit Amount\n3.Widthraw Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter your choise :");
                int choise= sc.nextInt();
                if(choise==1){
                    op.viewBalance();
                }
                else if (choise==2) {
                    System.out.println("Enter Amount to Deposit : ");
                    double deposit= sc.nextDouble();
                    op.depositAmount(deposit);
                }
                else if (choise==3) {
                    System.out.println("Enter Amount to Widthraw : ");
                    double Widthraw= sc.nextDouble();
                    op.widthrawAmount(Widthraw);
                }
                else if (choise==4) {
                    op.MiniStatement();

                } else if (choise==5){
                    System.out.println("Please collect your card.Thankyou for visiting ATM!!!!!!!");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter the choise 1-5");
                }


            }
       }
        else{
            System.out.println("Incorrect ATM number or Pin");
            System.exit(0);
        }
    }
}
