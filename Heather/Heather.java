
/**
 * Escreva a descrição da classe Heather aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Heather
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int temperature;
    private int min;
    private int max;
    private int increment;    

    /**
     * COnstrutor para objetos da classe Heather
     */
    public Heather(int max, int min)
    {
        // inicializa variáveis de instância
        this.temperature = 15; 
        this.increment = 5;
        if(max < 15)
            throw new IllegalArgumentException("The default temperature would be lower than the max value allowed! Max value must be higher than " + String.valueOf(temperature));
        else 
            this.max = max;
        if(min < 15)
            throw new IllegalArgumentException("The default temperature would be higher than the min value allowed! Min value must be lower than " + String.valueOf(temperature));            
        else 
            this.min = min;          
               
    }
    
    /**Warmer method to increase the temperature of the Heather 5 degrees per execution
    */
    public void warmer(){
       int newTemp = temperature + increment;
       if(newTemp > max)
           System.out.println("The temperature can't be higher than " + String.valueOf(max));
       else
           this.temperature = newTemp;
    }

    /**Cooler method to decrease the temperature of the Heather 5 degrees per execution
    */
    public void cooler(){
       int newTemp = temperature - increment;
       if(newTemp < min)
           System.out.println("The temperature can't be lower than " + String.valueOf(min));
       else
           this.temperature = newTemp;
    }    
    
    /**Access method
     * @return the current temperature
    */
   public int getTemperature(){
       return this.temperature;
   }
   
   /**Modifier method
    * change the increment value for the warmer/cooler methods
      */
   public void setIncrement(int increment){
       if(increment < 0)
             System.out.println(String.valueOf(increment) + " is an invalid value! The value can't be negative");
       else
            this.increment = increment;
   }
}
