package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        write();
        System.out.println(read());

    }

    public static void write() throws IOException {

        FileWriter fileWriter = new FileWriter("Song.txt");
        fileWriter.write("""
                So close, no matter how far
                Couldn't be much more from the heart
                Forever trusting who we are
                And nothing else matters
                Never opened myself this way
                Life is ours, we live it our way
                All these words I don't just say
                And nothing else matters""");
        fileWriter.close();
    }

    public static Song read() throws IOException {

        FileReader fileReader = new FileReader("Song.txt");
        Scanner scanner = new Scanner(fileReader);
        Song song = new Song();
        StringBuilder stringBuilder = new StringBuilder();
        song.setSong("Nothing else matters");
        song.setAuthor("Metallica");
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine()).append("\n");
        }
        song.setText(stringBuilder.toString());
        fileReader.close();
        return song;
    }
}
