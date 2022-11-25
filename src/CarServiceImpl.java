public class CarServiceImpl implements CarService{

    @Override
    public void tankowanie(double iloscPaliwa, Car car) {
        car.setIloscPaliwa(iloscPaliwa);
    }

    @Override
    public void pompowanie(double iloscPowietrza, Car car) {
        car.setIloscPowietrza(iloscPowietrza);

    }

    @Override
    public void malowanie(String kolor, Car car) {
        car.setKolor(kolor);
    }

}
