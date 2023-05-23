package observer;

public interface Observer {
    public void update(Observable o, Object args);
    public void update(Observable o);
}
