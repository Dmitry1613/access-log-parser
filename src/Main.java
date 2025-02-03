import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {

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

            try {
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;

                int lineCount = 0;
                int maxLength = 0;
                int minLength = Integer.MAX_VALUE;

                while ((line = reader.readLine()) != null) {
                    lineCount++;
                    if (line.length() > 1024) {
                        throw new RuntimeException("Строка превышает 1024 символа: " + line);
                    }
                    int length = line.length();
                    if (length > maxLength) {
                        maxLength = length;
                    }
                    if (length < minLength) {
                        minLength = length;
                    }
                }
                reader.close();

                System.out.printf("Общее количество строк: %d\n", lineCount);
                System.out.printf("Длина самой длинной строки: %d\n", maxLength);
                System.out.printf("Длина самой короткой строки: %d\n", minLength == Integer.MAX_VALUE ? 0 : minLength);

            } catch (RuntimeException ex) {
                System.out.println("Ошибка: " + ex.getMessage());
                break;
            } catch (Exception ex) {
                ex.printStackTrace();
                break;
            }
        }
    }
}
