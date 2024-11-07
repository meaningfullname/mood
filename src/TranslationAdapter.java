public class TranslationAdapter implements Translator {
    private ExternalAPI externalAPI;

    public TranslationAdapter(ExternalAPI externalAPI) {
        this.externalAPI = externalAPI;
    }

    @Override
    public String translate(String text, String fromLang, String toLang) {
        return externalAPI.performTranslation(text, fromLang, toLang);
    }
}
