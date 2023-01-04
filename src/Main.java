import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("Hello.txt");
        fileWriter.write("Hello world");
        fileWriter.close();

        FileReader fileReader = new FileReader("Hello.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}

class Exceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int counter = 0;

        for (int j = 0; j < 100; j++) {
            if (j * j == i) {
                counter++;
            }
        }
        if (counter == 0) {
            throw new Error();
        } else {
            System.out.println(" Everything ok!!! ");
        }
    }
}