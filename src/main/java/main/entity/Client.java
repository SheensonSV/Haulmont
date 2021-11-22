package main.entity;

public class Client {
    private String FIO;
    private String telNumber;
    private String email;

    public Client(String FIO, String telNumber, String email, String passNumber) {
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
}
