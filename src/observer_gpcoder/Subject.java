package observer_gpcoder;

public interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notifyAllObserver();
}
