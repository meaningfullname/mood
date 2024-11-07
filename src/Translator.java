interface Translator {
    String translate(String text, String fromLang, String toLang);
}

class GoogleTranslator implements Translator {
    @Override
    public String translate(String text, String fromLang, String toLang) {
        return "Перевод с использованием Google API";
    }
}

class YandexTranslator implements Translator {
    @Override
    public String translate(String text, String fromLang, String toLang) {
        return "Перевод с использованием Yandex API";
    }
}

abstract class TranslatorFactory {
    public abstract Translator createTranslator();
}

class GoogleTranslatorFactory extends TranslatorFactory {
    @Override
    public Translator createTranslator() {
        return new GoogleTranslator();
    }
}

class YandexTranslatorFactory extends TranslatorFactory {
    @Override
    public Translator createTranslator() {
        return new YandexTranslator();
    }
}
