import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TDFFileReader {

    private String fileName;
    private List<Cyclist> cyclistList;

    public TDFFileReader(String filename) throws FileNotFoundException {
        this.fileName = filename;
        cyclistList = new ArrayList<>();
    }

    public List<Cyclist> readFile() {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                String name = parts[1];
                String team = parts[2];

            cyclistList.add(new Cyclist(name, team));
        }
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cyclistList;
    }
}
