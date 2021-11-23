package main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {
    @Column(name = "clientlist")
    private List<Client> clientList;

    public Bank(List<Client> clientList, List<Credit> creditList) {
        this.clientList = clientList;
        this.creditList = creditList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Credit> getCreditList() {
        return creditList;
    }

    public void setCreditList(List<Credit> creditList) {
        this.creditList = creditList;
    }

    private List<Credit> creditList;
}
