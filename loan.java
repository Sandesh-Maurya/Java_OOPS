
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
        if (loanAmount==loanInfo.loanAmount){
            return 0;
        }
        else if(loanAmount>loanInfo.loanAmount){
            return 1;
        }
        else
            return -1;
    }

}

