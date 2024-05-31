import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите номер квартиры:");
        int apartmentNumber = sc.nextInt();


        final int FLOORS = 9;
        final int APARTMENTS_PER_FLOOR = 4;
        final int ENTRANCES = 5;
        final int APARTMENTS_PER_ENTRANCE = FLOORS * APARTMENTS_PER_FLOOR;


        int totalApartments = APARTMENTS_PER_ENTRANCE * ENTRANCES;

        if (apartmentNumber < 1 || apartmentNumber > totalApartments) {
            System.out.println("Такой квартиры нет в этом доме.");
        } else {
            int entranceNumber = (apartmentNumber - 1) / APARTMENTS_PER_ENTRANCE + 1;

            int apartmentInEntrance = (apartmentNumber - 1) % APARTMENTS_PER_ENTRANCE;
            int floorNumber = apartmentInEntrance / APARTMENTS_PER_FLOOR + 1;

            System.out.println(" Квартира " + apartmentNumber + " находиться в подъезде " + entranceNumber + " , на " + floorNumber + " этаже. ");

        }


    }
}
