import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
public class sort_instance{
    public static void main(String[] args){
        
        // sorting using treeset
        TreeSet<loan> loan_set=new TreeSet<loan>();
        loan_set.add(new loan(200000,10,"Sandesh"));
        loan_set.add(new loan(300000000,5,"Ankit"));
        loan_set.add(new loan(5000000,6,"Ganna"));
        loan_set.add(new loan(120000,8,"Teja"));
        loan_set.add(new loan(120010,5,"Teja"));
        System.out.println();
        System.out.println("Sorting Using Treeset");
        for(loan elem:loan_set){
            System.out.println(elem.loanAmount+" "+elem.tenure+" "+elem.loanApplicantName);
        }
    }

}