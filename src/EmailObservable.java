import java.util.Observable;

public class EmailObservable extends Observable {
    private String mails;

    public void setMails(String mails){
        this.mails=mails;
        setChanged();
        notifyObservers(this.mails);

    }

    
}
