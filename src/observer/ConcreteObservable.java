package observer;

import java.util.HashSet;
import java.util.Set;

public class ConcreteObservable implements Observable{
    final private Set<Observer> observers;

    public ConcreteObservable() {
        this.observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update(this);
        }
    }

    @Override
    public void notifyObservers(Object args) {
        for(Observer o: observers){
            o.update(this, args);
        }
    }
}
