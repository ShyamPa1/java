import javax.swing.*;

public class continueinmessagebox {
    public static void main(String[] args) {
        int sum=0;
        int option=0;
        while (option== JOptionPane.YES_OPTION){
        String data= JOptionPane.showInputDialog("enter an int value:");
            int da=Integer.parseInt(data);
            sum+=da;
            option=JOptionPane.showConfirmDialog(null,"continue");


        }
        JOptionPane.showMessageDialog(null,"the sum is"+sum);
    }
}
