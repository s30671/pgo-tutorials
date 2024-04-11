public class User {
    private String imie;
    private String nazwisko;
    private String email;
    private String haslo;
    private boolean czyGosc;


    public User(String imie, String nazwisko, String email, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.haslo = haslo;
        this.czyGosc = false;
    }

    public User(String email) {
        this.email = email;
        this.czyGosc = true;
    }

    public void aktualizujDoZarejestrowanegoUzytkownika(String imie, String nazwisko, String haslo){
        if(this.czyGosc){
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.haslo = haslo;
            this.czyGosc = false;
        }else{
            System.out.println("To konto nie jest kontem goscia");
        }
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public boolean isCzyGosc() {
        return czyGosc;
    }

    public void setCzyGosc(boolean czyGosc) {
        this.czyGosc = czyGosc;
    }
}
