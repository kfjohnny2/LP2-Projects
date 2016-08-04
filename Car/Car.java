/**
 * BlueJ simple application for a car simulation
 *
 * @author Johnnylee Bryan Marques da Rocha
 * @version (número de versão ou data)
 */
public class Car
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int gears;
    private String color;
    private float currentSpeed = 0;
    private Engine engine;
    private Tank tank;
    private Door rightDoor;
    private Door leftDoor;
    private Wheel[] wheels;
    /**
     * COnstrutor para objetos da classe Carro
     */
    public Car(int gears, String color, String fuelType, float engineCylinderCapacity, int wheelSize, int wheelPressureCapacity, float tankMaxCapacity, float tankCurrentFuel)
    {
        this.gears = gears;
        this.color = color;
        engine = new Engine(fuelType, engineCylinderCapacity);
        tank = new Tank(tankMaxCapacity, tankCurrentFuel);
        rightDoor = new Door();
        leftDoor = new Door();
        wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(wheelSize, wheelPressureCapacity);
        }

    }

    public void speedUp(float speed){
        float newFuel = tank.getCurrentFuel();
        if(speed > 0){
            if(engine.getPower()){
                this.setCurrentSpeed(currentSpeed+speed);
                newFuel -= (speed/100)*10;
                if(newFuel <= 0){
                    System.out.println("OUT OF GAS! Veicule will be turned off");
                    tank.setCurrentFuel(0);
                    engine.setPower(false);
                } else
                    tank.setCurrentFuel(newFuel);
            } else
                System.out.println("Veicule is turned off!");
        }
        else
            System.out.println(String.valueOf(speed) + " is an invalid value! Negative numbers not allowed");
    }

    public void breakUp(float speed){
        if(engine.getPower()){
            if(speed > 0){
                if(speed < currentSpeed)
                    this.setCurrentSpeed(currentSpeed - speed) ;
                else{
                    System.out.println("Hardbreak! Your actual speed will set to 0");       
                    this.setCurrentSpeed(0);
                }
            } else
                System.out.println("Invalid speed value!");
        }
    }

    public void turnOn(){
        if(!engine.getPower()){
            if(tank.getCurrentFuel() > 0){
                rightDoor.setState(false);
                leftDoor.setState(false);
                engine.setPower(true);
            } else
                System.out.println("Not enough gas to turn your car on!");
        }
        else
            System.out.println("Engine already on!");
    }

    public void turnOff(){
        if(engine.getPower()){
            engine.setPower();
            this.setCurrentSpeed(0);
        }
    }

    public void fuelUp(float value){
        float newFuel = tank.getCurrentFuel() + value;
        if(newFuel > tank.getMaxCapacity())
            System.out.println("You are putting too much gas on your tank! Take it easy. Your tank capacity is: " + String.valueOf(tank.getMaxCapacity()) + " and you current fuel is " + String.valueOf(tank.getCurrentFuel()));
        else
            tank.setCurrentFuel(newFuel);
    }

    public float getCurrentSpeed(){
        return this.currentSpeed;
    }

    public void setCurrentSpeed(float speed){
        if(speed >= 0){
            this.currentSpeed = speed;
        } else{
            System.out.println("Invalid speed value!");
        }
    }

    public String getColor(){
        return this.color;
    }

    public int getGears(){
        return this.gears;
    }

    public void veiculeInfo(){
        String engineStatus = engine.getPower() ? "On" : "Off";
        String rightDoorStatus = rightDoor.isOpen() ? "Open" : "Close";
        String leftDoorStatus = leftDoor.isOpen() ? "Open" : "Close";

        System.out.println(" Car color: " + this.getColor() + ".\n"
                            + this.getGears() + " gear(s).\n"
                            + "Wheel size: " + wheels[0].getSize()
                            + "\nThe veicule is " + engineStatus + " your current speed is " + this.getCurrentSpeed() 
                            + "KM/h. \nRight door: " + rightDoorStatus + "\nLeft door: " + leftDoorStatus);
    }
}
