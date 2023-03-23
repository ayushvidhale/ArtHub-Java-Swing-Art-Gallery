import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Imgae_data {
    public static void main(String[] args) {
        List<byte[]> Abstract_Painting = new ArrayList<>();
        List<byte[]> Ceramics = new ArrayList<>();
        List<byte[]> Digital_Art = new ArrayList<>();
        List<byte[]> Drawing = new ArrayList<>();
        List<byte[]> Landscape = new ArrayList<>();
        List<byte[]> Landscape_Painting = new ArrayList<>();
        List<byte[]> Oil_Painting = new ArrayList<>();
        List<byte[]> Sports = new ArrayList<>();
        List<byte[]> StillLife_Painting = new ArrayList<>();
        List<byte[]> Street = new ArrayList<>();
        List<byte[]> Water_Painting = new ArrayList<>();
        List<byte[]> Wildlife = new ArrayList<>();
        int i = 0;
        try {
            File folder = new File("Images"); // Change path to the folder containing image files
            File[] files = folder.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    FileInputStream fis = new FileInputStream(file);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    byte[] imageData = new byte[(int) file.length()];
                    bis.read(imageData);
                    if (i < 5) {
                        Abstract_Painting.add(imageData);
                    } else if (i < 10) {
                        Ceramics.add(imageData);
                    } else if (i < 15) {
                        Digital_Art.add(imageData);
                    } else if (i < 20) {
                        Drawing.add(imageData);
                    } else if (i < 25) {
                        Landscape.add(imageData);
                    } else if (i < 30) {
                        Landscape_Painting.add(imageData);
                    } else if (i < 35) {
                        Oil_Painting.add(imageData);
                    } else if (i < 40) {
                        Sports.add(imageData);
                    } else if (i < 45) {
                        StillLife_Painting.add(imageData);
                    } else if (i < 50) {
                        Street.add(imageData);
                    } else if (i < 55) {
                        Water_Painting.add(imageData);
                    } else if (i < 60) {
                        Wildlife.add(imageData);
                    }
                    ;
                    i = i + 1;
                    // System.out.println("Name of file: " + file);
                    // System.out.println("Byte Array: " + imageData + "\n\n");
                    // imagesData.add(imageData);
                    // System.out.println("\n\n"+imagesData.get(0));
                    bis.close();
                    fis.close();
                }
            }
            for (byte[] bt : Abstract_Painting) {
                System.out.println("Abs_Byte Array: " + bt + "\n");
            }
            for (byte[] bt : Sports) {
                System.out.println("Sports_Byte Array: " + bt + "\n");
            }
            for (byte[] bt : Water_Painting) {
                System.out.println("Water_Byte Array: " + bt + "\n");
            }
            for (byte[] bt : Landscape) {
                System.out.println("Landscape_Byte Array: " + bt + "\n");
            }
            // for (int i = 0; i < imagesData.size(); i++) {
            // System.out.println("Byte Array: " + imagesData.get(i));
            // }

            // Now you can use the imagesData list to manipulate the image data

        } catch (IOException e) {
            System.out.println("Error reading image files: " + e.getMessage());
        }
    }
}

// import java.io.BufferedInputStream;
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.IOException;

// public class Imgae_data {
// public static void main(String[] args) {
// try {
// File imageFile = new File("Images/Abstract_Painting (1).jpeg"); // Change
// path to your image file
// FileInputStream fis = new FileInputStream(imageFile);
// BufferedInputStream bis = new BufferedInputStream(fis);

// byte[] imageData = new byte[(int) imageFile.length()];
// bis.read(imageData);
// System.out.println(imageData);

// // Now you can use the imageData array to manipulate the image data

// bis.close();
// fis.close();

// } catch (IOException e) {
// System.out.println("Error reading image file: " + e.getMessage());
// }
// }
// }



