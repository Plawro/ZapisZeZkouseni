import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFrame extends JFrame {

    private JPanel mainPanel;
    private JTextArea textArea1;

    public MainFrame() throws FileNotFoundException {
        setTitle("Zapis Testu");
        setSize(640, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setVisible(true);
        precti();
        vypisCisla();
    }

    public static void main(String[] args) throws FileNotFoundException {
        MainFrame frame = new MainFrame();

    }

    int pocet;
    Scanner scanner;
    void precti() throws FileNotFoundException {
        try(Scanner scanner = new Scanner(new File("data.txt"))){
            while (scanner.hasNextLine()){
                pocet += Integer.parseInt(scanner.nextLine());
            }
            //JOptionPane.showMessageDialog(null, String.valueOf(pocet));
            System.out.println(pocet);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    int posledniCislo;
    void vypisCisla(){
        while (posledniCislo<100){
            posledniCislo++;
            if(textArea1.getText().equals("")){
                textArea1.setText(String.valueOf(posledniCislo));
            }else{
                textArea1.setText(textArea1.getText()+","+posledniCislo);
            }


        }
    }
}
