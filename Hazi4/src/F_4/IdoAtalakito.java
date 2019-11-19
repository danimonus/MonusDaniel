package F_4;

 import java.applet.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IdoAtalakito extends JFrame implements ActionListener {

    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JLabel lb5;
    JLabel lb6;
    JLabel lb7;
    JLabel lb8;
    JLabel lb9;
    JLabel lb10;
    JLabel lb11;
    JLabel lb12;
    

    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;
    JTextField tf11;
    JTextField tf12;
    
    JButton b1;
    
    JPanel jp1;
    JPanel jp2;
    JPanel jp3;
    JPanel jp4;
    
    public IdoAtalakito() throws HeadlessException{
    super ("IdoAtalakito");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("Nap");
    lb2 = new JLabel("Óra");
    lb3 = new JLabel("Perc");
    lb4 = new JLabel("Másodperc");
    
    lb5 = new JLabel("Nap");
    lb6 = new JLabel("Óra");
    lb7 = new JLabel("Perc");
    lb8 = new JLabel("Másodperc"); 
    
    lb9 = new JLabel("Nap");
    lb10 = new JLabel("Óra");
    lb11 = new JLabel("Perc");
    lb12 = new JLabel("Másodperc");
       
    b1 = new JButton("Számol");
    
    tf1 = new JTextField(5);
    tf2 = new JTextField(5);
    tf3 = new JTextField(5);
    tf4 = new JTextField(5);
    tf5 = new JTextField(5);
    tf6 = new JTextField(5);
    tf7 = new JTextField(5);
    tf8 = new JTextField(5);
    tf9 = new JTextField(5);
    tf10 = new JTextField(5);
    tf11 = new JTextField(5);
    tf12 = new JTextField(5);
    
    jp1 = new JPanel();
    jp2 = new JPanel();
    jp3 = new JPanel();
    jp4 = new JPanel();
    

    GridLayout gr = new GridLayout(4,1);
    setLayout(gr);
    
    GridLayout gr1 = new GridLayout(1,4);
    jp1.setLayout(gr1);
    
    GridLayout gr2 = new GridLayout(1,4);
    jp2.setLayout(gr2);
    
    GridLayout gr3 = new GridLayout(1,4);
    jp3.setLayout(gr3);
    
    GridLayout gr4 = new GridLayout(1,1);
    jp4.setLayout(gr4);
    
    b1.addActionListener(this);

    
    jp1.add(tf1);
    jp1.add(lb1);
    jp1.add(tf2);
    jp1.add(lb2);
    jp1.add(tf3);
    jp1.add(lb3);
    jp1.add(tf4);
    jp1.add(lb4);
    jp2.add(tf5);
    jp2.add(lb5);
    jp2.add(tf6);
    jp2.add(lb6);
    jp2.add(tf7);
    jp2.add(lb7);
    jp2.add(tf8);
    jp2.add(lb8);
    
    jp4.add(b1);
    
    jp3.add(tf9);
    jp3.add(lb9);
    jp3.add(tf10);
    jp3.add(lb10);
    jp3.add(tf11);
    jp3.add(lb11);
    jp3.add(tf12);
    jp3.add(lb12);
    
    this.add(jp1);
    this.add(jp2);
    this.add(jp4);
    this.add(jp3);

    pack();
    }
    
    public static void main(String[] args) {
        IdoAtalakito id = new IdoAtalakito();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     int nap1 = Integer.parseInt(tf1.getText());
     int nap2 = Integer.parseInt(tf5.getText());
     int on = nap1+nap2;
     
     int ora1 = Integer.parseInt(tf2.getText());
     int ora2 = Integer.parseInt(tf6.getText());
     int oo = ora1+ora2;
     if(oo >= 24){
     on++;
     oo-=24;
     }
     
     int perc1 = Integer.parseInt(tf3.getText());
     int perc2 = Integer.parseInt(tf7.getText());
     int op = perc1+perc2;
     if(op>=60){
     oo++;
     op-=60;
     }
     
     int mp1 = Integer.parseInt(tf4.getText());
     int mp2 = Integer.parseInt(tf8.getText());
     int omp = mp1+mp2;
     if(omp>=60){
     op++;
     omp-=60;
     }
     
     if(e.getSource()==b1){
        
         tf9.setText(""+on);
         tf10.setText(""+oo);
         tf11.setText(""+op);
         tf12.setText(""+omp);
         
               }
    }



    
}
