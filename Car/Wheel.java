
/**
 * Class for the wheel of the car
 *
 * @author Johnnylee Bryan Marques da Rocha
 */
public class Wheel
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int size;
    private int pressureCapacity;

    /**
     * COnstrutor para objetos da classe Wheel
     */
    public Wheel(int size, int pressureCapacity)
    {
        if(size > 0 && pressureCapacity > 0){
            this.size = size;
            this.pressureCapacity = pressureCapacity;
        } else{
            System.out.println("All the values must be higher than 0.");
        }
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getPressure(){
        return this.pressureCapacity;
    }

    public void setPressure(int pressureCapacity){
        this.pressureCapacity = pressureCapacity;
    }    
}
