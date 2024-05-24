public class Main {
    public static void main(String[] args) {

                double fuelPerLiter = 1.2;
                int distanceToCity = 120;
                double fuelConsumption100Km = 8;


                double fuelNeeded = (fuelConsumption100Km / 100) * distanceToCity;


                double totalCost = fuelNeeded * fuelPerLiter;


                System.out.println(totalCost + " $ The cost of travel ");
            }
        }


