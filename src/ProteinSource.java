import javax.swing.*;

public class ProteinSource {

    private String name;
    private double gram;

    public ProteinSource(String name, double gram){
        this.name = name;
        this.gram = gram;
    }

    public void printMessage(double gramsToEat){
        double totalGram = this.gram*gramsToEat;
        JOptionPane.showMessageDialog(null, "You will get " + totalGram + " grams of protein");
    }

    @Override
    public String toString(){
        return this.name;
    }

}
