public class Main3 {
    public static void main(String[] args) {

// uzytkownicy

        User guest1 = new User("gosc@gmail.com");
        User guest2 = new User("gosc2@gmail.com");
        User user1 = new User("Konrad","Filipczuk","konradF@gmail.com","haslo123");


        System.out.println("Konto goscia 1: " + guest1.getEmail() + ", Guest: " + guest1.isCzyGosc());
        System.out.println("Konto goscia 2: " + guest2.getEmail() + ", Guest: " + guest2.isCzyGosc());

        guest1.aktualizujDoZarejestrowanegoUzytkownika("Marcin" , "Majkut", "haslo1234");

        System.out.println("Konto goscia po aktualizacji: " + guest1.getImie() + ", " + guest1.getNazwisko() + ", " + guest1.getEmail() + ", " + guest1.getHaslo() + ", Guest: " + guest1.isCzyGosc());


// produkty

        Product product1 = new Product("laptop", 3100.0, "LP7463");
        Product product2 = new Product("Telefon", 2800.0, "TL6921");
        Product product3 = new Product("Lodowka", 2100.0, "LD5432", 10 );


        product1.zmienCene(1700);

        product3.zmienIloscSztuk(5);

        System.out.println();
        System.out.println("Produkt 1: " + product1.pobierzWszystkieParametry());
        System.out.println("Produkt 2: " + product2.pobierzWszystkieParametry());
        System.out.println("Produkt 3: " + product3.pobierzWszystkieParametry());

    }
}
