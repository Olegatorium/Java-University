import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> namesList = readNamesFromFile("names.txt");

        for (var item : namesList){
            System.out.println(item);
        }
    }

    private static List<String> readNamesFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            List<String> namesList = new ArrayList<>();
            String data;
            while ((data = br.readLine()) != null) {
                namesList.add(data);
            }
            return namesList;
        } catch (IOException e) {
            throw new RuntimeException("Failed to read names from file: " + filename, e);
        }
    }
}
