import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Введите текст и нажмите <Enter>:" );
        //String text = new Scanner(System.in).nextLine();
        //System.out.println("Длина текста: " + text.length());
        //System.out.println("Случайное число от 0 до 1: " + Math.random());


        int correctFilesCount = 0;

        while (true) {
            System.out.println("Укажите путь к файлу:");

            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                if (!fileExists) {
                    System.out.println("Файл не существует.");
                }
                if (isDirectory) {
                    System.out.println("Указанный путь ведет к папке, а не к файлу.");
                }
                continue;
            }

            correctFilesCount++;
            System.out.printf("Путь указан верно. Это файл номер %d.\n", correctFilesCount);
        }
    }
}
