
/**
 * Class for the engine of the car
 *
 * @author Johnnylee Bryan Marques da Rocha
 */
public class Engine
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String fuel;
    private float cylinderCapacity;
    private boolean power = false;
    
    /**
     * COnstrutor para objetos da classe Motor
     */
    public Engine(String fuel, float cylinderCapacity)
    {
        this.fuel = fuel;    
        this.cylinderCapacity = cylinderCapacity;    
    }

    /**
    *Only alternate the power state of the engine
    */
    public void setPower(){
        this.power = power == true ? false : true;    
    }

    /**
    *Set the power state given by the client
    */
    public void setPower(boolean power){
        this.power = power;    
    }

    public boolean getPower(){
        return this.power;
    }

    public void setFuel(String fuel){
        this.fuel = fuel;
    }

    public String getFuel(){
        return this.fuel;
    }


}
