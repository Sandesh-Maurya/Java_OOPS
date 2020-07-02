/* Program to calculate simple and compound interest using InterestCalculator as interface. 
*/
import java.lang.Math;
import java.util.Scanner;


interface InterestCalculator{
    void calculateinterest(Float tenure,Float principal,Float rateofinterest);
}

class simpleInterestCalculator implements InterestCalculator{

    Float interest_amount;
    public void calculateinterest(Float tenure,Float principal,Float rateofinterest){
        interest_amount=principal*((rateofinterest*tenure)/100);
        System.out.println("Simple Interest : " +interest_amount);
    }
}
class compoundInterestCalculator implements InterestCalculator{
    
    Double amount;
    public void calculateinterest(Float tenure,Float principal,Float rateofinterest){
        amount=principal*(Math.pow((1+rateofinterest/100) , tenure) -1);
        // float interest_amount = (float)amount; //type casting error
        System.out.println("Compound Interest : "+ amount);
    }
}

public class interestCalculation{   
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        
        float[] Parameters={0,0,0};
        //userinput for interest calculation
        System.out.println("For Calculating Simple interest Press 1 And for Compound interest press any number : ");
        int x=scan.nextInt();
        int param;
        System.out.println("Enter the parameters such as Tenure, Principle_Amount and Rate of interest respectively : ");
        
        for(int i =0;i<3;i++){
            param=scan.nextInt();
            Parameters[i]=param;
        }
       
        if( x == 1 ){

            simpleInterestCalculator obj1 =new simpleInterestCalculator();
            obj1.calculateinterest(Parameters[0],Parameters[1],Parameters[2]);
        }
        else{
        compoundInterestCalculator obj2= new compoundInterestCalculator();
        obj2.calculateinterest(Parameters[0],Parameters[1],Parameters[2]);
        }


    }
}