import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ImageGallery2 extends JFrame {

    public ImageGallery2() throws IOException {
        // Create a panel to hold the images
        JPanel panel = new JPanel(new GridLayout(0, 4));

        // Loop through each image file in a directory
        File dir = new File("path/to/images/directory");
        for (File file : dir.listFiles()) {
            // Load the image from the file
            Image image = ImageIO.read(file);

            // Create a label to display the image
            JLabel label = new JLabel(new ImageIcon(image.getScaledInstance(150, -1, Image.SCALE_SMOOTH)));

            // Add the label to the panel
            panel.add(label);
        }

        // Create a scroll pane to hold the panel
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setPreferredSize(new Dimension(800, 600));

        // Add the scroll pane to the frame
        add(scrollPane);

        // Set the frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Image Gallery");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new ImageGallery2();
    }
}
