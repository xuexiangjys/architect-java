package designpattern.behavior.observer.subject;

import designpattern.behavior.observer.observer.Observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observer> mVector = new Vector<>();

	@Override
	public void register(Observer observer) {
		mVector.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		mVector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> elements = mVector.elements();
		while(elements.hasMoreElements()){
			elements.nextElement().onChanged();
		}
	}
}
