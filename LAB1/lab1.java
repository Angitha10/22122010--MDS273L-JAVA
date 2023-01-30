import java.util.Scanner;
public class lab1 {
    public static void main(String[] args){
        System.out.println("Enter Name: ");
        Scanner take_input = new Scanner(System.in);
        String name = take_input.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(take_input.nextLine());
        System.out.println("Enter State: ");
        String state= take_input.nextLine();
        System.out.print("Enter employee company: ");
        String company = take_input.nextLine();
        System.out.println("Enter gender(m/f): ");
        char gender = take_input.next().charAt(0);
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gender == 'm' ? "MALE" : "FEMALE"));
        System.out.println("State: " + state);
        System.out.println("Company: " + company);
        switch(state){
            case "Jammu and Kashmir":
            case "Himachal Pradesh":
            case "Punjab":            
            case "Haryana":
            case "Uttarakhand":
            case "Delhi":
            case "Rajasthan":
            case "Uttar Pradesh":
            System.out.println("The Employee is from the northen states of India; Preferable work location is in Delhi");
            break;
            case "Arunachal Pradesh":
            case "Assam":
            case "Manipur":
            case "Meghalaya":
            case "Mizoram":
            case "Nagaland":
            case "Sikkim":
            case "Tripura":
            case "Bihar":
            case "Jharkhand":
            case "Odisha":
            case "West Bengal":
            System.out.println("The Employee is from the eastern states of India; Preferable work location is in Kolkata");
            break;
            case "Kerala":
            case "Karnataka":
            case "Tamil Nadu":
            case "Andhra Pradesh":
            System.out.println("The Employee is from the southern states of India; Preferable work location is in Banglore");
            case "Maharashtra":
            case "Gujarat":
            System.out.println("The Employee is from the western states of India; Preferable work location is in Mumbai");
        }
        if (company.equals("Facebook") || company.equals("Google") ||
        company.equals("Microsoft") || company.equals("Samsung") ||
        company.equals("IBM") || company.equals("Apple")) {
        System.out.println("The employee is working in Top MNC Companies");


    }
}

    
}