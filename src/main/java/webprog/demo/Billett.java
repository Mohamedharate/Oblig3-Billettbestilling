package webprog.demo;

public class Billett {
    private String fornavn;
    private String etternavn;
    private String film;
    private String telefonnr;
    private String mail;
    private String antall;

    public Billett(){

    }

    public Billett(String fornavn, String etternavn, String film, String telefonnr, String mail, String antall) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.film = film;
        this.telefonnr = telefonnr;
        this.mail = mail;
        this.antall = antall;
    }



    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setFilm(String film) {
        this.film = film;
    }


    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }



    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getFilm() {
        return film;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public String getMail() {
        return mail;
    }

    public String getAntall() {
        return antall;
    }

}
