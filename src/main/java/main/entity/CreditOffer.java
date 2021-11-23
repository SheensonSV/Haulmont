package main.entity;

import javax.persistence.*;

@Entity
@Table(name = "creditoffer")
public class CreditOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Client client;

    private Credit credit;

    @Column(name = "creditsum")
    private int creditSum;

    private LoanPaymentSchedule loanPaymentSchedule;
}
