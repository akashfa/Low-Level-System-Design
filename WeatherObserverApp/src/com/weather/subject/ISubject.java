package com.weather.subject;

import com.weather.observer.IObserver;

public interface ISubject {
	
	void registerObserver(IObserver o);
	void removeObserver(IObserver o);
	
	void notifyObserver();

}
