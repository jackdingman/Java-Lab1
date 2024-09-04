import java.awt.*;
import javax.swing.*;

/*
When running this program, please keep files in the images folder, and declare them as resources on your Intellij.
 */
public class MakingChange {

    public static void main(String[] args){

        JFrame frame = new JFrame("Lab One");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.pack();

        RegisterPanel registerPanel = new RegisterPanel();
        frame.add(registerPanel);

        //frame.getContentPane().add(registerPanel);
        frame.setPreferredSize(new Dimension(2000, 1200)); // dimension object for width and height
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        //frame.setResizable(false); // so the normal proportions don't come out of line
    }
}