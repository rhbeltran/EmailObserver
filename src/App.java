public class App {
    public static void main(String[] args) throws Exception {
        EmailObserver notifier = new EmailObserver();
        EmailObservable inbox = new EmailObservable();
        inbox.addObserver(notifier);
        inbox.setMails("Nuevo correo");
        inbox.setMails("Nuevo correo 2");
        inbox.setMails("Nuevo correo 3");
        inbox.setMails("Nuevo correo 4");
        
    }
}
