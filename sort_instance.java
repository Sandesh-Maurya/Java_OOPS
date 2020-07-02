import java.util.ArrayList;
import java.util.Collections;
import java.lang.*; 
import java.util.*; 
class loan_{
    double loanAmount;
    int tenure;
    String loanApplicantName;
    loan_(double loanAmount,int tenure,String loanApplicantName){
        this.loanAmount=loanAmount;
        this.tenure=tenure;
        this.loanApplicantName=loanApplicantName;
    }
}
class sort_tenure implements Comparator<loan_>{
    public int compare(loan_ loanInfo1,loan_ loanInfo2){
        return loanInfo1.tenure - loanInfo2.tenure;        
    }
}

class sort_loanAmount implements Comparator<loan_>{
    public int compare(loan_ info1,loan_ info2){
        return info1.tenure -info2.tenure;
    }
}
public class sort_instance{
    public static void main(String[] args){
        ArrayList<loan_> loan_obj=new ArrayList<loan_>();
        loan_obj.add(new loan_(200000,10,"Sandesh"));
        loan_obj.add(new loan_(30000,5,"Ankit"));
        loan_obj.add(new loan_(50000,6,"Ganna"));
        loan_obj.add(new loan_(120000,8,"Teja"));

        Collections.sort(loan_obj,new sort_tenure());
        System.out.println("Sorting Based on Tenure");
        for(loan_ elem:loan_obj){
            System.out.println(elem.loanAmount+" "+elem.tenure+" "+elem.loanApplicantName);
        }

        System.out.println(); 
        Collections.sort(loan_obj,new sort_loanAmount());
        System.out.println("Sorting Based on Loan_Amount");
        for(loan_ elem:loan_obj){
            System.out.println(elem.loanAmount+" "+elem.tenure+" "+elem.loanApplicantName);
        }

    }

}