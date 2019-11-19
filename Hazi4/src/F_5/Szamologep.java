package F_5;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Szamologep extends JFrame implements ActionListener {
    
    
  JButton b1;
  JButton b2;
  JButton b3;
  JButton b4;  
  JButton b5;
  JButton b6;
  JButton b7;
  JButton b8;
  JButton b9;
  JButton b10;
  JButton b11;
  JButton b12;
  JButton b13;
  JButton b14;
  JButton b15;
  JButton b16;
  JButton b17;
  JButton b18;
  JButton b19;
  JButton b20;  
  JButton b21;
  JButton b22;
  JButton b23;
  JButton b24;
  JButton b25;
  JButton b26;
  JButton b27;
  JButton b28;
  
  JTextField tf1;
  
  JPanel p1;
  JPanel p2;
  JPanel p3;
  JPanel p4;
  JPanel p5;
  JPanel p6;
  
  public Szamologep() throws HeadlessException{
  super("Szamologep");
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  
     b1 = new JButton("");
     b2 = new JButton("Backspace");
     b3 = new JButton("CE");
     b4 = new JButton("C");
     b5 = new JButton("MC");
     b6 = new JButton("7");
     b7 = new JButton("8");
     b8 = new JButton("9");
     b9 = new JButton("/");
     b10 = new JButton("sqrt");
     b11 = new JButton("MR");
     b12 = new JButton("4");
     b13 = new JButton("5");
     b14 = new JButton("6");
     b15 = new JButton("*");
     b16 = new JButton("%");
     b17 = new JButton("MS");
     b18 = new JButton("1");
     b19 = new JButton("2");
     b20 = new JButton("3");
     b21 = new JButton("-");
     b22 = new JButton("1/x");
     b23 = new JButton("M+");
     b24 = new JButton("0");
     b25 = new JButton("+/-");
     b26 = new JButton(".");
     b27 = new JButton("+");
     b28 = new JButton("=");
     
     tf1 = new JTextField(20);
     
    p1 = new JPanel();
    p2 = new JPanel();
    p3 = new JPanel();
    p4 = new JPanel();
    p5 = new JPanel();
    p6 = new JPanel();
    
    GridLayout gr = new GridLayout(6,1);
    setLayout(gr);
    
    GridLayout gr1 = new GridLayout(1,6);
    p1.setLayout(gr1);
    
    GridLayout gr2 = new GridLayout(1,6);
    p2.setLayout(gr2);
    
    GridLayout gr3 = new GridLayout(1,6);
    p3.setLayout(gr3);
    
    GridLayout gr4 = new GridLayout(1,6);
    p4.setLayout(gr4);
    
    GridLayout gr5 = new GridLayout(1,6);
    p5.setLayout(gr5);
    
    GridLayout gr6 = new GridLayout(1,6);
    p6.setLayout(gr6);
    
    
    
    p1.add(tf1);
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b4);
    p3.add(b5);
    p3.add(b6);
    p3.add(b7);
    p3.add(b8);
    p3.add(b9);
    p3.add(b10);
    p4.add(b11);
    p4.add(b12);
    p4.add(b13);
    p4.add(b14);
    p4.add(b15);
    p4.add(b16);
    p5.add(b17);
    p5.add(b18);
    p5.add(b19);
    p5.add(b20);
    p5.add(b21);
    p5.add(b22);
    p6.add(b23);
    p6.add(b24); 
    p6.add(b25); 
    p6.add(b26); 
    p6.add(b27); 
    p6.add(b28); 
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);
    b15.addActionListener(this);
    b16.addActionListener(this);
    b17.addActionListener(this);
    b18.addActionListener(this);
    b19.addActionListener(this);
    b20.addActionListener(this);
    b21.addActionListener(this);
    b22.addActionListener(this);
    b23.addActionListener(this);
    b24.addActionListener(this);
    b25.addActionListener(this);
    b25.addActionListener(this);
    b26.addActionListener(this);
    b27.addActionListener(this);
    b28.addActionListener(this);
    
    this.add(p1);
    this.add(p2);
    this.add(p3);
    this.add(p4);
    this.add(p5);
    this.add(p6);
     pack();
  
  }

  
    public static void main(String[] args) {
        Szamologep sg = new Szamologep();
    }
  
  
  
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b2){
             tf1.setText("Back");
             }
        if(e.getSource()==b3){
             tf1.setText("");
             }
        if(e.getSource()==b4){
             tf1.setText("");
             }
        if(e.getSource()==b5){
             tf1.setText("MC");
             }
        /*if(e.getSource()==b6){
             tf1.setText("7");
             }
        if(e.getSource()==b7){
             tf1.setText("8");
             }
        if(e.getSource()==b8){
             tf1.setText("9");
             }*/
        if(e.getSource()==b9){
             tf1.setText("/");
             }
        if(e.getSource()==b10){
             tf1.setText("sqrt");
             }
        if(e.getSource()==b11){
             tf1.setText("MR");
             }
        /*if(e.getSource()==b12){
             tf1.setText("4");
             }
        if(e.getSource()==b13){
             tf1.setText("5");
             }
        if(e.getSource()==b14){
             tf1.setText("6");
             }*/
        if(e.getSource()==b15){
             tf1.setText("*");
             }
        if(e.getSource()==b16){
             tf1.setText("%");
             }
        if(e.getSource()==b17){
             tf1.setText("MS");
             }
        /*if(e.getSource()==b18){
             tf1.setText("1");
             }
        if(e.getSource()==b19){
             tf1.setText("2");
             }
        if(e.getSource()==b20){
             tf1.setText("3");
             }*/
        if(e.getSource()==b21){
             tf1.setText("-");
             }
        if(e.getSource()==b22){
             tf1.setText("1/x");
             }
        if(e.getSource()==b23){
             tf1.setText("M+");
             }
        /*if(e.getSource()==b24){
             tf1.setText("0");
             }*/
        if(e.getSource()==b25){
             tf1.setText("+/-");
             }
        if(e.getSource()==b26){
             tf1.setText(".");
             }
        if(e.getSource()==b27){
             tf1.setText("+");
             }
        if(e.getSource()==b28){
             tf1.setText("=");
             }
        
        if(e.getSource()==b4){
             tf1.setText("");
             }

    
    
    

int z = 0;
String s=e.getActionCommand(); 

if(s.equals("Exit")) 
{ 
System.exit(0); 
} 
if(s.equals("1")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"1"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"1"); 
z=0; 
} 
} 
if(s.equals("2")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"2"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"2"); 
z=0; 
} 
} 
if(s.equals("3")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"3"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"3"); 
z=0; 
} 
} 
if(s.equals("4")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"4"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"4"); 
z=0; 
} 
} 
if(s.equals("5")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"5"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"5"); 
z=0; 
} 
} 
if(s.equals("6")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"6"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"6"); 
z=0; 
} 
} 
if(s.equals("7")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"7"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"7"); 
z=0; 
} 
} 
if(s.equals("8")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"8"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"8"); 
z=0; 
} 
} 
if(s.equals("9")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"9"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"9"); 
z=0; 
} 
} 
if(s.equals("0")) 
{ 
if(z==0) 
{ 
tf1.setText(tf1.getText()+"0"); 
} 
else 
{ 
tf1.setText(""); 
tf1.setText(tf1.getText()+"0"); 
z=0; 
}

}
    }
    
}  

