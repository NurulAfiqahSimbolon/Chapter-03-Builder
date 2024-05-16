public class Robot {
    private String shield, sword, gun, brainchip;

    /**
     * Declare empty constructur which able to create basic Robot parts without
     * infer too Long parameters to declarre on object
     */
    public Robot() {
    }
    public String getShield() {
        return shield;
    }
    public void setShield(String shield) {
        this.shield = shield;
    }
    public String getSword() {
        return sword;
    }
    public void setSword(String sword) {
        this.sword = sword;
    }
    public String getGun() {
        return gun;
    }
    public void setGun(String gun) {
        this.gun = gun;
    }
    public String getBrainchip() {
        return brainchip;
    }
    public void setBrainchip(String brainchip) {
        this.brainchip = brainchip;
    }

    @Override
    public String toString() {
        return  "Robot Properties"
                + "\n--------"
                + "\nShield: " + getShield()
                + "\nGun: " + getGun()
                + "\nSword: " + getSword()
                + "\nBrain Chip: " + getBrainchip();
    }
}
class Robotbuilder {
    private Robot robot;
    public Robotbuilder() {
        this(new Robot());
    }
    public Robotbuilder(Robot robot) {
        this.robot = robot;
    }
    public Robotbuilder shield(String shield) {
        robot.setShield(shield);
        return this;
    }
    public Robotbuilder gun(String gun) {
        robot.setGun(gun);
        return this;
    }
    public Robotbuilder sword(String sword) {
        robot.setSword(sword);
        return this;
    }
    public Robotbuilder brainchip(String brainchip) {
        robot.setBrainchip(brainchip);
        return this;
    }
    public Robot getResult() {
        return robot;
    }
}