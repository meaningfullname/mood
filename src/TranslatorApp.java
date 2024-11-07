import java.util.Scanner;

public class TranslatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TranslationFacade translationFacade = new TranslationFacade();


        System.out.println("===========================================");
        System.out.println("|         ПЕРЕВОДЧИК С РУССКОГО НА АНГЛИЙСКИЙ        |");
        System.out.println("===========================================");


        System.out.print("Введите текст для перевода: ");
        String inputText = scanner.nextLine();

        System.out.println("\nВыберите сервис для перевода:");
        System.out.println("1. Google Translator");
        System.out.println("2. Yandex Translator");
        System.out.print("Ваш выбор (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String translatedText = "";


        if (choice == 1) {
            System.out.println("\nПеревод с использованием Google Translator...");
            translatedText = translationFacade.translateWithGoogle(inputText, "ru", "en");
        } else if (choice == 2) {
            System.out.println("\nПеревод с использованием Yandex Translator...");
            translatedText = translationFacade.translateWithYandex(inputText, "ru", "en");
        } else {
            System.out.println("Ошибка: Неверный выбор. Попробуйте снова.");
            System.exit(1);
        }


        System.out.println("\n===========================================");
        System.out.println("|                 РЕЗУЛЬТАТ                |");
        System.out.println("===========================================");
        System.out.println("Перевод: " + translatedText);
        System.out.println("===========================================");


        System.out.println("\nСпасибо за использование нашего переводчика!");
        System.out.println("===========================================");

        scanner.close();
    }
}
