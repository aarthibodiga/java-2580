package CRM;

import java.time.LocalDate;

public class Interaction {
    public static void main(String[] args){
        int InteractionID = 25014;
        String InteractionType = "In Person";
        String Notes = "Customer asking about pricing";
        LocalDate InteractionDate = LocalDate.of(2025,8,14);
        short CustomerID =305;
        String EmployeeName = "Karthik";

        System.out.println("InteractionID is:" +InteractionID );
        System.out.println("Interaction Type is:" +InteractionType);
        System.out.println("Interaction Notes:" +Notes);
        System.out.println("Interaction Date:" +InteractionDate);
        System.out.println("Customer ID:" +CustomerID);
        System.out.println("Employee Name:" +EmployeeName);


    }


}
