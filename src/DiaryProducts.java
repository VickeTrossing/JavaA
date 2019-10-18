import javax.swing.*;
import java.util.function.DoublePredicate;

public class DiaryProducts {

    private double gram;

    public DiaryProducts(double gram){

        this.gram = gram;

    }

    public void printDairyProduct(){
        JOptionPane.showMessageDialog(null, "You will get " + gram);
    }

    static void milk(){
        double gram;
        gram = Double.parseDouble(JOptionPane.showInputDialog(null, "How much milk do you have?"));
        gram = gram * 0.034;
        JOptionPane.showMessageDialog(null,"You will get " + gram + " grams of protein");
    }

    static void cheese(){
        double gram;
        gram = Double.parseDouble(JOptionPane.showInputDialog(null, "How much cheese do you have"));
        gram = gram * 0.25;
        JOptionPane.showMessageDialog(null, "You will get " + gram + " grams of protein");
    }

    static void swedishKvarg(){
        double gram;
        gram = Double.parseDouble(JOptionPane.showInputDialog(null, "How much swedish kvarg do you have?"));
        gram = gram * 1.2;
        JOptionPane.showMessageDialog(null, "You will get " + gram + " grams of protein");

    }

}
