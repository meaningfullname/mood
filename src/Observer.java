import java.util.List;
import java.util.ArrayList;

interface Observer {
    void update(String translatedText);
}

class TranslationObserver implements Observer {
    @Override
    public void update(String translatedText) {
        System.out.println("Перевод завершен: " + translatedText);
    }
}

class TranslationSubject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String translatedText) {
        for (Observer observer : observers) {
            observer.update(translatedText);
        }
    }
}
