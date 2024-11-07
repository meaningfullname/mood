public class TranslationService {
    private static TranslationService instance;

    private TranslationService() {}

    public static TranslationService getInstance() {
        if (instance == null) {
            instance = new TranslationService();
        }
        return instance;
    }

    public String translate(String text, String fromLang, String toLang) {
        // Логика перевода (можно использовать сторонние API)
        return "Переведенный текст"; // Заглушка для примера
    }
}
