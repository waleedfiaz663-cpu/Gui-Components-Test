
package guicomponentstest;

import javax.swing.*;

public class GuiComponentsTest {

   
    public static void main(String[] args) {
        
        JFrame jf = new JFrame("Swing components");
        
        JPanel jp = new JPanel();
        
        JLabel jl1 = new JLabel("Enter Your Name");
        
        JTextField jtf = new JTextField(10);
        
        JButton B = new JButton("Submit");
        
        JButton b1 = new JButton("Not Submit");
        
        
        
        JCheckBox cb = new JCheckBox("I Agree");
        
        JCheckBox jcb = new JCheckBox("Not Agree");
        
        String[] cities = {"Abbottabad","Islamabad","Peshwar","Quetta"};
        
        JComboBox<String> combobox = new JComboBox<>(cities);
        
        String[] Cars = {"Bmw","Porche","Buggati","RR"};
        
        JComboBox<String> combobox1 = new JComboBox<>(Cars);
        
         jf.setLayout(new java.awt.GridLayout(3,3));
        
        
        jp.add(jl1);
        
        jp.add(jtf);
        
        jp.add(B);
        
        jp.add(b1);
        
        jp.add(cb);
        
        jp.add(jcb);
        
        jf.add(jp);
        
        jf.add(combobox);
        
        jf.add(combobox1);
        
        
        jf.setSize(300,300);
        
        jf.setVisible(true);
    }
    
}
