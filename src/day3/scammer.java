package day3;

import javax.swing.JOptionPane;

public class scammer {
public static void main(String[] args) {
JOptionPane.showConfirmDialog(null, "you are being scammed click yes for help");
String name=JOptionPane.showInputDialog("what is your name");	
JOptionPane.showMessageDialog(null, "hello " + name);
String social=JOptionPane.showInputDialog("what is you social security number");
String credit=JOptionPane.showInputDialog("what is your credit card number");
String Address=JOptionPane.showInputDialog("where do you live");
String phone=JOptionPane.showInputDialog("what is your phone number");
JOptionPane.showConfirmDialog(null,"is this correct? " +" ,social security"+ social+" ,credit card " + credit +" ,address "+Address+" ,phone "+ phone);
JOptionPane.showMessageDialog(null, "Thank you for helping us scam you");


}
}
