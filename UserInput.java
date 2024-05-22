import java.awt.event.*;
import javax.swing.*;
public class UserInput extends JFrame {
    private JLabel promptLabel;
    private JTextField userInputField;
    private JButton submitButton;
    
    public UserInput(){
        setTitle("USer Input");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        promptLabel = new JLabel("Enter your name :");
        promptLabel.setBounds(20,20,200,30);
        add(promptLabel);

        userInputField = new JTextField();
        promptLabel.setBounds(20,50,200,30);
        add(userInputField);

        submitButton = new JButton("Submit");
        promptLabel.setBounds(100,100,80,30);
        add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = userInputField.getText();
                JOptionPane.showMessageDialog(null, "You entered: " + userInput);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserInput().setVisible(true);
            }
        });
    }
}


    
