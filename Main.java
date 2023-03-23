import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "Description_of_Arts.csv";
        String line = "";
        String cvsSplitBy = ",";
        List<String[]> studentData = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split each line by comma
                String[] data = line.split(cvsSplitBy);
                // Add the split data to the list
                studentData.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Artist Name,Art Type,Medium,Date,Dimensions(cm),Description,Price($),Availability,ID
        ArrayList<String> Name_of_Artist = new ArrayList<>();
        ArrayList<String> Art_Type = new ArrayList<>();
        ArrayList<String> Date = new ArrayList<>();
        ArrayList<String> Medium_of_Art = new ArrayList<>();
        ArrayList<String> Dimensions_of_Art = new ArrayList<>();
        ArrayList<String> Description_of_Art = new ArrayList<>();
        ArrayList<String> Price_of_Art = new ArrayList<>();
        ArrayList<String> Availability = new ArrayList<>();
        ArrayList<String> ID_of_Art = new ArrayList<>();

        // Print the student data list
        for (String[] student : studentData) {
        // System.out.println("Name: " + Name_of_Artists.add(student[0]) + ", Art_Type: " + student[1] + ",Medium: " + student[2] );
            Name_of_Artist.add(student[0]);Art_Type.add(student[1]);Medium_of_Art.add(student[2]);Date.add(student[3]);
            Dimensions_of_Art.add(student[4]);Description_of_Art.add(student[5]);Price_of_Art.add(student[6]);Availability.add(student[7]);
            ID_of_Art.add(student[8]);
        }
        System.out.println(Name_of_Artist);  
        for(String name : Name_of_Artist){
            System.out.println(name);
        }
        System.out.println("\n\n");
        for(String name : Art_Type){
            System.out.println(name);
        }
        System.out.println("\n\n");
        for(String name : Medium_of_Art){
            System.out.println(name);
        }
        System.out.println("\n\n");
        for(String name : Dimensions_of_Art){
            System.out.println(name);
        }
        System.out.println("\n\n");
        for(String name : Description_of_Art){
            System.out.println(name);
        }
        System.out.println("\n\n");
        for(String name : Price_of_Art){
            System.out.println(name);
        }
        System.out.println("\n\n");
        for(String name : Availability){
            System.out.println(name);
        }
        System.out.println("\n\n");
        for(String name : ID_of_Art){
            System.out.println(name);
        }
        System.out.println("\n\n");
        

    }
}
