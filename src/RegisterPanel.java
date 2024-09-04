import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegisterPanel extends JPanel{
    private JTextField input;
    private Register register;
    private PursePanel changePanel;
    private JPanel inputPanel;

    public RegisterPanel() {
        register = new Register();

        inputPanel = new JPanel();
        input = new JTextField(10);
        changePanel = new PursePanel();


        input.setEditable(true);
        input.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    new InputListener().actionPerformed(null);
                }
            }
        });

        inputPanel.add(input); //add amount submission box to the jpanel
        //inputPanel.add(button); //add button for amount submission to jpanel.

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(changePanel, BorderLayout.CENTER);
        inputPanel.setBackground(Color.BLACK);
        changePanel.setBackground(Color.darkGray);
        changePanel.setPreferredSize(new Dimension(2000, 1200));
    }

    private class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double amount = Double.parseDouble(input.getText()); // retrieves the amount from the input in the text area, as a double
            Purse change = register.makeChange(amount); //calculation of the change
            changePanel.updatePurse(change);//updates purse panel over in PursePanel.java for doing graphics
        }
    }
}