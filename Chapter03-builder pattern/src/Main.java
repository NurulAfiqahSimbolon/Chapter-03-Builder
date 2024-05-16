//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <Shield, Sword, Gun, Brainchip> void main(String[] args) {
                    Robot robot1 = new Robot();
                    robot1.setShield("Energy Shield");
                    robot1.setGun("Plasma Cannon");
                    robot1.setSword("Vibroblade");
                    robot1.setBrainchip("AI Core v3.0");
                    System.out.println("Robot 1 details:\n" + robot1.toString());

                    Robot robot2 = new Robotbuilder()
                            .shield("Titanium Alloy")
                            .gun("Laser Rifle")
                            .sword(null)  // Set sword to null
                            .brainchip("Military Grade Processor")
                            .getResult();
                    System.out.println("\nRobot 2 details:\n" + robot2.toString());

                    ComputerSetBuilder builder = new ComputerSetBuilder();
                    builder.keyboard("Mechanical Keyboard");
                    builder.mouse("Gaming Mouse");
                    builder.speaker("Stereo Speaker");
                    builder.monitor("27-inch LCD Monitor");

                    ComputerSet computerSet = builder.getResult();

                    System.out.println("Computer Set Details:");
                    System.out.println("------------");
                    System.out.println("Keyboard: " + computerSet.getKeyboard());
                    System.out.println("Mouse: " + computerSet.getMouse());
                    System.out.println("Speaker: " + computerSet.getSpeaker());
                    System.out.println("Monitor: " + computerSet.getMonitor());
                    System.out.println("\n");


                    Car car1 = new Car.CarBuilder()
                            .model("Tesla Model S")
                            .color("Red")
                            .enginePower(420)
                            .automatic(true)
                            .Builder();

                    Car car2 = new Car.CarBuilder()
                            .model("Toyota Camry")
                            .color("Silver")
                            .enginePower(200)
                            .Builder();

                    System.out.println(car1.toString());
                    System.out.println("\n---\n");
                    System.out.println(car2.toString());
                }
        }