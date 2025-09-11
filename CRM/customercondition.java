package CRM;

public class task2 {
    public static void main(String[] args){

    int customerId = 235;
    String customerName ="Caroline";
    boolean isPremium = true;
    int yearsPartnership=5;
    String dealStage="Negotiation";
    double baseDiscount=0.0;
    double extraDiscount=0.0;
    double dealValue = 50000;

    if(isPremium){
       baseDiscount=0.10;
    }else if(yearsPartnership >=3){
        baseDiscount=0;
    }
        
     else {
        baseDiscount=0;
     } 
     baseDiscount=isPremium ?0.10:yearsPartnership>=3?0.05:0;
      switch(dealStage){

            case "Negotiation":
                  extraDiscount +=0.3;
                  break;
              
            case "Proposal": 
                 extraDiscount +=0.2;   
                 break;
             case "Closed":
                   extraDiscount +=0.5;
                   break;
            default:
                   extraDiscount =0;

      }
        
            double totalDiscount=baseDiscount+extraDiscount;
            double finalDiscount=totalDiscount*dealValue;
            double finalDealValue=dealValue-finalDiscount;

            System.out.println("Customer ID:" +customerId);
            System.out.println("Customer Name:" +customerName);
            System.out.println("Is Premium:" +isPremium);
            System.out.println("Years Of Partnership" +yearsPartnership);
            System.out.println("Deal Stage:" +dealStage);
            System.out.println("Deal Value:" +dealValue);
            System.out.println("Base Discount using terinary:" +(baseDiscount*100) +"%");
            System.out.printf("Base Discount: %.2f%%\n", baseDiscount*100);
            System.out.printf("Extra Discount: %.2f%%\n",  extraDiscount*100);
            System.out.printf("total Discount: %2.f%%\n", totalDiscount*100);
            System.out.printf("Final Discount:%.2f\n", finalDiscount*100);
            System.out.println( "Final Deal Value:" +finalDealValue);
    }
    }
    

