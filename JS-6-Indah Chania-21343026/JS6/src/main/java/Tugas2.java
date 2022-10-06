
import javax.swing.JOptionPane;


/**
 * created by Indah Chania 21343026
 * @author Indah
 */
public class Tugas2 {
    public static void main(String[] args) {
        String a, b, c;
        int nilai1, nilai2, nilai3, average;
        
        a = JOptionPane.showInputDialog("Masukkan nilai 1: ");
        b = JOptionPane.showInputDialog("Masukkan nilai 2: ");
        c = JOptionPane.showInputDialog("Masukkan nilai 3: ");
        
        nilai1 = Integer.parseInt(a);
        nilai2 = Integer.parseInt(b);
        nilai3 = Integer.parseInt(c);
        
        average = (nilai1 + nilai2 + nilai3)/3;
        
        if (average >= 60){
                JOptionPane.showMessageDialog(null, "Average: " + average + " :-)");
            }
            else 
                JOptionPane.showMessageDialog(null, "Average: " + average + " :-(");
    }
}

