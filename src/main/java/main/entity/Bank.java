package main.entity;

import java.util.List;

public class Bank {
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
