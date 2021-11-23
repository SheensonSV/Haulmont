package main.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "fio")
    private String FIO;

    @Column(name = "telnumber")
    private String telNumber;

    @Column(name = "email")
    private String email;

    public Client(String FIO, String telNumber, String email, String passNumber) {
        this.FIO = FIO;
        this.telNumber = telNumber;
        this.email = email;
        this.passNumber = passNumber;
    }

    public Client(int id, String FIO, String telNumber, String email, String passNumber) {
        this.id = id;
        this.FIO = FIO;
        this.telNumber = telNumber;
        this.email = email;
        this.passNumber = passNumber;
    }

    private String passNumber;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

