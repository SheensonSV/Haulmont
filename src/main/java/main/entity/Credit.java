package main.entity;

import javax.persistence.*;

@Entity
@Table(name = "credit")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = " creditlimit")
    private int creditLimit;

    @Column(name = "annualpercentofcredit")
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
