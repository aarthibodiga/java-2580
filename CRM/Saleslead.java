package CRM;

import java.time.LocalDate;

public record Saleslead() {
    public static void main(String[] args){
         int leadId = 1024;
         String leadName ="Arjun";
         String LeadEmail = "arjun@gmail.com";
         long PhoneNo=9876534656L;
         String LeadSource = "Google";
         LocalDate leadCreationDate =LocalDate.of(2024,4,23);
         boolean leadActive = true;
         String leadAssignedTo = "Marketing";
         long LeadEstimatedDealValue=7500;

         System.out.println("Lead ID:"+leadId);
         System.out.println("Lead Name:"+leadName);
         System.out.println("Lead email:"+LeadEmail);
         System.out.println("PhoneNo:"+PhoneNo);
         System.out.println("Lead Source:"+LeadSource );
         System.out.println("Lead Creation Date:"+leadCreationDate );
         System.out.println("Is Active:"+leadActive );
         System.out.println("Lead Assigned To:"+leadAssignedTo);
         System.out.println("Lead Estimated Deal Value:"+LeadEstimatedDealValue);

    }
    

}
