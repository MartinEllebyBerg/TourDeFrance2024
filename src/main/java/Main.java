import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TDFFileReader tdfFileReader = new TDFFileReader("src/tdffinishers2024.csv");

        System.out.println(tdfFileReader.readFile());
    }
}
