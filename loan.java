
public class loan implements Comparable<loan>{
    double loanAmount;
    int tenure;
    String loanApplicantName;
    loan(double loanAmount,int tenure,String loanApplicantName){
        this.loanAmount=loanAmount;
        this.tenure=tenure;
        this.loanApplicantName=loanApplicantName;
    }

    public int compareTo(loan loanInfo){
        if (tenure==loanInfo.tenure){
            return 0;
        }
        else if(tenure>loanInfo.tenure){
            return 1;
        }
        else
            return -1;
    }

}

