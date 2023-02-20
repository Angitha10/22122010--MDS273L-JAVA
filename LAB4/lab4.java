import java.lang.reflect.Array;
import java.util.*;

public class lab4{
    static int accNo;
    static String name;
    static float accbal;
    static Scanner scan = new Scanner(System.in);
    static String tran[][] = new String[50][4];
    static int iter = 0;

    static float initialize(){
        System.out.print("Enter user name: ");
        name=scan.nextLine();
        System.out.print("\nEnter account number: ");
        accNo=Integer.parseInt(scan.nextLine());
        System.out.print("\nEnter initial balance: ");
        accbal=Float.parseFloat(scan.nextLine());
        return accbal;

    }

    static float deposit(){
        System.out.print("Enter amount to be deposited: ");
        tran[iter][0] = ""+accbal;
        float dep_amt =Float.parseFloat(scan.nextLine());
        accbal+=dep_amt;
        System.out.print("\nCurrent bal is: " + accbal);
        tran[iter][1] = "Deposit";
        tran[iter][2] = ""+dep_amt;
        tran[iter][3] = ""+accbal;
        return accbal;
    }
    static float withdraw(){
        System.out.print("Enter amount to be withdrawn: ");
        float with_amt=Float.parseFloat(scan.nextLine());
        if(with_amt>accbal){
            System.out.print("\nBalance is low. Current balance is: " +accbal);
            }
        else{
            tran[iter][0] = ""+with_amt;
            accbal-=with_amt;
            System.out.println("\n Amount of INR " +with_amt+ "withdrawn.");
            tran[iter][1] = "Withdraw";
            tran[iter][2] = ""+with_amt;
            tran[iter][3] = ""+accbal;
            }
        return accbal;

    }
    static void summary(){
        System.out.println("Customer name: " +name);
        System.out.println("Account number: " +accNo );
        System.out.println("Current balance is: " +accbal);
    }

    static void Transactions(int cont){
        for(int i = 0; i<=cont; i++){
            System.out.println("Previous Balance: "+tran[i][0]+"  ||  Transaction Type: "+tran[i][1]+"  ||  Transaction Ammout: "+tran[i][2]+"  ||  Current Balance: "+tran[i][3]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int count = 0;
        int choice;
        char cosi = 'n';
        initialize();
        do{
            System.out.println("\n1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Print Transactions");
            System.out.println("4. Print Account Summary");
            System.out.println("Exit");
            System.out.println("Enter your choice:");

            choice = Integer.parseInt(scan.nextLine());
            iter++;

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    Transactions(iter);
                    break;
                case 4:
                    summary();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
            }
            System.out.println("\nPress 'y' or 'Y' for continuing the program..");
            cosi = scan.nextLine().charAt(0);
        }while(cosi=='y'||cosi=='Y');
        scan.close();
    }
}