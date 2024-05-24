public class Main {
    public static void main(String[] args) {

                double sideA = 0.3;
                double sideB = 0.4;
                double sideC = 0.5;


                double semiPerimeter = (sideA + sideB + sideC) / 2;


                double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));


                System.out.println("Area of a triangle: " + area);
            }
        }


