class TranslationContext {
    private Translator strategy;

    public void setStrategy(Translator strategy) {
        this.strategy = strategy;
    }

    public String executeTranslation(String text, String fromLang, String toLang) {
        return strategy.translate(text, fromLang, toLang);
    }
}
