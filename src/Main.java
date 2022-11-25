import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       Car car1 = new Car(0, 0, null);
        CarServiceImpl carService = new CarServiceImpl();

       car1.setKolor("zielony");
        System.out.println("kolor auta " + car1.getKolor());
        carService.malowanie("Czerwony", car1);
        System.out.println("kolor po przemalowaniu: " + car1.getKolor());


        System.out.println("Ilość powietrza: " + car1.getIloscPowietrza());
       carService.pompowanie(50, car1);
        System.out.println("ilość powietrza po napompowaniu: " + car1.getIloscPowietrza());

        System.out.println("Przed zatankowaniem: " + car1.getIloscPaliwa()); //[przed zatankowaniem

       carService.tankowanie(20, car1);
        System.out.println("Po zatankowaniu: " + car1.getIloscPaliwa());


    }
}