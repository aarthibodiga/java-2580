package CRM;

import java.time.LocalDate;

public record SalesOpportunity() {
    public static void main(String[] args){
        int OppurtunityID = 15023;
        String OpportunityName = "Cloud Software Deal";
        int DealAmount= 50000;
        LocalDate OpportunityCloseDate = LocalDate.of(2025,8,12);
        String OpportunityStage = "Processing";
        String OpportunityStatus = "Open";
        String OpportunityOwner = "Harsha";
        String CustomerType = "New";

        System.out.println("OpportunityID:" +OppurtunityID);
        System.out.println( "OpportunityName:" +OpportunityName );
        System.out.println("Deal Amount:" +DealAmount);
        System.out.println("Opportunity Close Date:" +OpportunityCloseDate );
        System.out.println("Opportunity Stage:" +OpportunityStage);
        System.out.println("Opportunity Status:" +OpportunityStatus);
        System.out.println("Opportunity Owner:" +OpportunityOwner);
        System.out.println("Customer Type:" +CustomerType);
    }
}
