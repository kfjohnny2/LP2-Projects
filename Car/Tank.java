
/**
 * Escreva a descrição da classe Tank aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Tank
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private float maxCapacity;
    private float currentFuel;

    /**
     * COnstrutor para objetos da classe Tank
     */
    public Tank(float maxCapacity, float currentFuel)
    {
        if(maxCapacity > 0 && currentFuel > 0){
            this.maxCapacity = maxCapacity;
            if(currentFuel > maxCapacity){
                System.out.println("Your current fuel can't be higher than the tank max capacity! The max capacity will be setup.");
                currentFuel = maxCapacity;
            }else{
                this.currentFuel = currentFuel;
            }
        } else{
                System.out.println("The values can't be negative");
        }
    }

    public void setCurrentFuel(float currentFuel){
        this.currentFuel = currentFuel;
    }

    public float getCurrentFuel(){
        return this.currentFuel;
    }

    public void setMaxCapacity(float maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public float getMaxCapacity(){
        return this.maxCapacity;
    }
}
