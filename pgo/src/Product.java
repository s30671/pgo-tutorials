public class Product {
    private String nazwa;
    private double cena;
    private String kodProduktu;
    private int iloscSztuk;


    public Product(String nazwa, double cena, String kodProduktu, int iloscSztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kodProduktu = kodProduktu;
        this.iloscSztuk = iloscSztuk;
    }


    public Product(String nazwa, double cena, String kodProduktu) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kodProduktu = kodProduktu;
        this.iloscSztuk = 0;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getKodProduktu() {
        return kodProduktu;
    }

    public void setKodProduktu(String kodProduktu) {
        this.kodProduktu = kodProduktu;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscSztuk(int iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }


    public void zmienCene(double nowaCena){
        this.cena = nowaCena;
    }


    public void zmienIloscSztuk(int nowaIloscSztuk){
        if(nowaIloscSztuk >= 0){
            this.iloscSztuk = nowaIloscSztuk;
        }else{
            System.out.println("Liczba sztuk nie moze byc mniejsza od 0");
        }
    }

    public String pobierzWszystkieParametry(){
        return "Nazwa: " + this.nazwa + ", Cena: " + this.cena + ", Kod produktu: " + this.kodProduktu + ", Ilość sztuk: " + this.iloscSztuk;
    }
}
