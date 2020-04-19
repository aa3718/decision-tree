import java.lang.Math;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;

public class entropyCalculator {

    public void informationGain() {

        File csvFile = new File("/Users/Chapman/Decision_tree/src/main/resources/playTennisCVS.csv");

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line;
            ArrayList<String[]> dataArrayList = new ArrayList<String[]>();

            while ((line = br.readLine()) != null) {
                String[] input = line.split(",");
                dataArrayList.add(input);
                System.out.println(input[0] + ' ' + input[1] + ' ' + input[2] + ' ' + input[3] + ' ' + input[4]);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
        System.out.println("Hey first commit!");
        entropyCalculator ec = new entropyCalculator();
        ec.informationGain();
    }
}
