
/**
 * Escreva a descrição da classe Credit aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Credit
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int left;

    /**
     * COnstrutor para objetos da classe Credit
     */
    public Credit()
    {
        this.left = 1000;

    }
    
    public Credit(int left)
    {
        if(left >= 0)
            this.left = left;
        else {
            this.left = 0;
            System.out.println(String.valueOf(left) + " is an invalid value! Must be a positive value!");
        }
        

    }

    
    /** Returns the amount of credits that is avaiable 
     * @return left.
     */
    public int getLeft(){
        return this.left;
    }
    
     /** Attribute modificator*/
     
    public void setLeft(int left){
        if(left >= 0)
            this.left = left;
        else {
            System.out.println(String.valueOf(left) + " is an invalid value! Must be a positive value!");
        }
    }
    
     /** Sums the current amount of credits with the new recharge value*/
    public void topUp(int value){
        if(value >= 0)
            this.left += value;
        else {
            System.out.println(String.valueOf(value) + " is an invalid value! Must be a positive value!");
        }
    }
    
}
