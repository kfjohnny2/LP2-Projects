
/**
 * Class for the car doors
 *
 * @author Johnnylee Bryan Marques da Rocha
 */
public class Door
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean state = false;

    /**
     * COnstrutor para objetos da classe Door
     */
    public Door()
    {

    }

    public boolean isOpen(){
        return this.state;
    }

    /**
    *Only alternate the state of the door
    */
    public void setState(){
        this.state = state ? false : true; 
    }

    /**
    *Set the state given by the client
    * @param state : open == true
    */
    public void setState(boolean state){
        this.state = state; 
    }
}
