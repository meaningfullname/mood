class TranslationFacade {
    private Translator googleTranslator;
    private Translator yandexTranslator;

    public TranslationFacade() {
        this.googleTranslator = new GoogleTranslator();
        this.yandexTranslator = new YandexTranslator();
    }

    public String translateWithGoogle(String text, String fromLang, String toLang) {
        return googleTranslator.translate(text, fromLang, toLang);
    }

    public String translateWithYandex(String text, String fromLang, String toLang) {
        return yandexTranslator.translate(text, fromLang, toLang);
    }
}
