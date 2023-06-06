public class Main {
    public static void main(String[] args) {
        

        SUV fortuner = new SUV("Fortuner", false);
        fortuner.move(50,0);
        fortuner.accelerate(40);
        System.out.println("Current Gear: " + fortuner.getCurrentGear());
        System.out.println("Current Speed: " + fortuner.getCurrentSpeed());
    }
}
