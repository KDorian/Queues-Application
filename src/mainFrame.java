import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class mainFrame extends JFrame {
    private JPanel panel;
    private JButton insertButton;
    private JButton deleteButton;
    private JTextArea textArea1;

    Queues obj = new Queues(10);

    public mainFrame() {

        setContentPane(panel);

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();

                int n = rand.nextInt(50) + 1;

                obj.insert(n);
                textArea1.setText("Array: \n" + obj.toString() + "\nThe number of elements is : " + obj.itemCount);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.removeData();

                textArea1.setText("Array: \n" + obj.toString() + "\nThe number is :" + obj.itemCount);
            }
        });
    }
}
