public class Car {
    private double iloscPowietrza;
    private double iloscPaliwa;
    private String kolor;


    public Car(double iloscPowietrza, double iloscPaliwa, String kolor) {
        this.iloscPowietrza = iloscPowietrza;
        this.iloscPaliwa = iloscPaliwa;
        this.kolor = kolor;
    }




    public double getIloscPowietrza() {
        return iloscPowietrza;
    }

    public void setIloscPowietrza(double iloscPowietrza) {
        this.iloscPowietrza = iloscPowietrza;
    }

    public double getIloscPaliwa() {
        return iloscPaliwa;
    }

    public void setIloscPaliwa(double iloscPaliwa) {
        this.iloscPaliwa = iloscPaliwa;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }


}
