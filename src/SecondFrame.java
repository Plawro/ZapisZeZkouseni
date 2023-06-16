import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SecondFrame extends JFrame {

    private JPanel mainPanel;
    private JCheckBox checkBox1;
    private JButton button1;

    public SecondFrame() throws FileNotFoundException {
        setTitle("Zapis Testu");
        setSize(300, 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setVisible(true);
        button1.addActionListener(e -> isItActive());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Akce");
        menuBar.add(menu1);
        JMenuItem item1 = new JMenuItem("Zaškrtni checkbox");
        menu1.add(item1);
        item1.addActionListener(e-> checkBox1.setSelected(true));
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) throws FileNotFoundException {
        SecondFrame frame = new SecondFrame();

    }

    void isItActive(){
        if(checkBox1.isSelected()){
            JOptionPane.showMessageDialog(null, "Je zaškrtnuto");
        }else{
            JOptionPane.showMessageDialog(null, "Není zaškrtnuto");
        }
    }


}
