package lesson01;

/**
 * User: Shestau
 * Date: 03.03.2020
 */

public class Main {
    /**
     * First java program
     * @param args: program arguments
     */

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello!");
        Car raceCar = new RaceCar();
        Car simpleCar = new SimpleCar();

        System.out.println(raceCar.getSpeed());
        raceCar.go();
        simpleCar.go();

    }
}
