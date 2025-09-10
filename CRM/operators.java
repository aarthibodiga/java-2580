package CRM;

public class operators {
    public static void main(String[] args){

        int CustomerID = 103;
        String CustomerName ="Shubman";
        double totalPurchase = 6000;
        int InteractionCount =5;
        int leadID = 25013;
        double leadBudjet = 5000;
        boolean isContacted = true;
        double opportunityValues = 4563;
        boolean isClosed = false;

        double avgPurchase = totalPurchase/InteractionCount;
        boolean Salesopportunity = opportunityValues>=5000;
        boolean isPriortised= leadBudjet>3000 && isContacted;
        InteractionCount++;


          System.out.println("Customer ID is :" +CustomerID);
          System.out.println("Customer Name:" +CustomerName);
          System.out.println("Average Purchase is:" +avgPurchase );
          System.out.println("Lead Status:" +isContacted);
          System.out.println("Sales Opportunity:" + Salesopportunity);
          System.out.println("Is Priortised:" +isPriortised);
          System.out.println("Interaction Count After a New INteraction:" +InteractionCount++);
          
          







    }
    
    
}
