package CRM;
import java.util.*;

public class EmiCalculator {
    double carPrice;
    double downPayment;
    double Rate_Of_Intrest;
    byte tenure;
    double total_loan_amount;
    double payable_amount;
    double emi;
    
    public void Calculation(){
          Scanner input = new Scanner(System.in);
        System.out.println("Enter OnRoad Price:");
        carPrice = input.nextDouble();
        System.out.println("enter down Payment:");
        downPayment = input.nextDouble();
        System.out.println("Enter Rate of Intrest:");
        Rate_Of_Intrest = input.nextDouble();
        System.out.println("Enter Tenure:");
        tenure = input.nextByte();
        total_loan_amount = carPrice -downPayment;
        double r= (Rate_Of_Intrest/(12*100));
        int n = tenure*12;
        emi = ((total_loan_amount)*(r)*(Math.pow((1+r),n)))/(Math.pow((1+r),n)-1);
        payable_amount = n*emi;
        System.out.println("==========CALCULATE EMI OF CAR=========");
        System.out.println("OnRoad Price of a car : " +carPrice);
        System.out.println("Down Pyment :" +downPayment);
        System.out.println("Rate of Intrest : " +Rate_Of_Intrest);
        System.out.println("Total Payable Amount After Tenure : " + payable_amount);
        System.out.println("Monthly EMi:" +emi);

    }



    }


    

