public class Povestea {
    public static void main(String[] args) {
        Biserica bisericaSfIosif = new Biserica();

        bisericaSfIosif.nume = "Catedrala Romano Catolica Sf Iosif";
        bisericaSfIosif.capacitate = 300;
        bisericaSfIosif.tipReligie = "catolica";
        bisericaSfIosif.buget = 500;
        bisericaSfIosif.latitudine = 18.553;
        bisericaSfIosif.longitudine = 74.844;
        bisericaSfIosif.rating = 5;
        bisericaSfIosif.oameniPrezenti = 285;
        bisericaSfIosif.program = "Luni - Duminica orele 6:00 - 17:00";


        Biserica SfGheorghe = new Biserica();

        SfGheorghe.nume = "Biserica Sfantul Gheorghe";
        SfGheorghe. capacitate = 100;
        SfGheorghe.tipReligie = "ortodoxa";
        SfGheorghe.buget = 200;
        SfGheorghe.longitudine = 43.801;
        SfGheorghe.latitudine = 12.840;
        SfGheorghe.rating = 3;
        SfGheorghe.oameniPrezenti = 56;
        SfGheorghe.program = "Luni - Duminica orele 6:00 - 15:00";

        bisericaSfIosif.faSlujba();
        bisericaSfIosif.primesteOameni( 12);

        SfGheorghe.faSlujba();
        SfGheorghe.primesteOameni(78);

    }
}
