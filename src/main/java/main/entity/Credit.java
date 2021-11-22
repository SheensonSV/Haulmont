package main.entity;

public class Credit {
    private int creditLimit;
    private long annualPercentOfCredit;


    public Credit(int creditLimit, long annualPercentOfCredit) {
        this.creditLimit = creditLimit;
        this.annualPercentOfCredit = annualPercentOfCredit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public long getAnnualPercentOfCredit() {
        return annualPercentOfCredit;
    }

    public void setAnnualPercentOfCredit(long annualPercentOfCredit) {
        this.annualPercentOfCredit = annualPercentOfCredit;
    }
}
