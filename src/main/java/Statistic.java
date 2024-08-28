import javax.xml.stream.FactoryConfigurationError;
import java.io.FileNotFoundException;
import java.util.*;

public class Statistic {

    private List<Cyclist> cyclistList;
    private HashMap<String, String> teamsWithMembers;

    public Statistic(String filename) throws FileNotFoundException {
        TDFFileReader tdfFileReader = new TDFFileReader(filename);
        cyclistList = tdfFileReader.readFile();
    }


    public List<Cyclist> getTeams() {
        //TODO:

        return null;
    }

    public Map<String, String> getTeamsWithMembers() {
        //TODO:
        teamsWithMembers = new HashMap<>();
        for (Cyclist c : cyclistList) {
            String cyclist = c.getName();
        }
        return null;
    }

    public List<Cyclist> getTeamMembers(String team) {
        //TODO:
        return null;
    }
}
