public class Operation {
    private double capital;
    private int term; // в днях
    private double interest;


    public Operation(double capital, int term, double interest) {
        this.capital = capital;
        this.term = term;
        this.interest = interest;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
