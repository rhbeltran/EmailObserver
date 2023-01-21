import java.util.Observable;
import java.util.Observer;

public class EmailObserver implements Observer{
    private String mails;
    @Override
    public void update (Observable o, Object arg){
     this.mails=(String) arg;
     System.out.println("Email recibido: " + this.mails);   
    }

}