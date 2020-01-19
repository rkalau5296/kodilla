package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {
    private final List<String> tasks;
    private final String name;
    private final List<Observer> observers;

    public TaskQueue(String name) {
        tasks = new ArrayList<>();
        this.name = name;
        observers = new ArrayList<>();
    }

    public List<String> getMessages() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void sendTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

}
