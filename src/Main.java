import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("Hello.txt");
        fileWriter.write("Hello world");
        fileWriter.close();

        FileReader fileReader = new FileReader("text.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}
class Exceptions {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                throw new IOException(); // Выбрасывание исключений
            }
        }
    }
}