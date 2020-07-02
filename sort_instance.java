import java.util.ArrayList;
import java.util.Collections;
public class sort_instance{
    public static void main(String[] args){
        ArrayList<loan> loan_obj=new ArrayList<loan>();
        loan_obj.add(new loan(200000,10,"Sandesh"));
        loan_obj.add(new loan(30000,5,"Ankit"));
        loan_obj.add(new loan(50000,6,"Ganna"));
        loan_obj.add(new loan(120000,8,"Teja"));

        Collections.sort(loan_obj);
        for(loan elem:loan_obj){
            System.out.println(elem.loanAmount+" "+elem.tenure+" "+elem.loanApplicantName);
        }

    }

}