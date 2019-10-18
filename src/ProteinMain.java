import javax.swing.*;
import java.awt.*;

public class ProteinMain {

    public static void main(String[] args) {

        //User gets to choose what kind of food they want from the array.
        String[] foodChoise = {"Meat & fish", "Vegetable", "Diary products"};
        String foodInput = (String) JOptionPane.showInputDialog(null, "What kind of food?", "How much protein?", JOptionPane.QUESTION_MESSAGE, null, foodChoise, foodChoise[0]);

        //Program goes into a switch depending on what was choosen.
        switch (foodInput) {
            case "Meat & fish":
                //A new array taking in different kinds of choises in the selected option.
                ProteinSource[] meatProtein = {new ProteinSource("Kyckling", 0.25), new ProteinSource("Beef", 0.25),
                                                new ProteinSource("Salmon", 0.20), new ProteinSource("Egg", 0.13)};

                //You get to choose an option from the array
                ProteinSource selectedMeatProtein = (ProteinSource) JOptionPane.showInputDialog(null, "What kind of meat or fish?", "Choise", JOptionPane.QUESTION_MESSAGE, null, meatProtein, meatProtein[0]);
                //Code ask for a double representing grams of your choosen food group
                Double gramsOfMeat = Double.parseDouble(JOptionPane.showInputDialog(null, "How much?"));

                selectedMeatProtein.printMessage(gramsOfMeat);
                break;


           case "Vegetable":
                ProteinSource[] vegetableProtein = {new ProteinSource("Broccoli", 0.02), new ProteinSource("Beans", 0.25),
                                                    new ProteinSource("banana", 0.01), new ProteinSource("Bell pepper", 0.02)};

                ProteinSource selectedVegetableProtein = (ProteinSource) JOptionPane.showInputDialog(null, "What kind of vegetable?", "Choise", JOptionPane.QUESTION_MESSAGE, null, vegetableProtein, vegetableProtein[0]);

                if(selectedVegetableProtein.equals(vegetableProtein[1])){
                    ProteinSource[] beanProtein = {new ProteinSource("Chickpeas", 0.179), new ProteinSource("Kindney beans", 0.134),
                                                    new ProteinSource("Black beans", 0.152), new ProteinSource("Soybeans", 0.36),
                                                    new ProteinSource("Lentils", 0.36)};

                    ProteinSource selectedBeanProtein = (ProteinSource) JOptionPane.showInputDialog(null, "What kind of beans?", "Choise", JOptionPane.QUESTION_MESSAGE, null, beanProtein, beanProtein[0]);
                    Double gramsOfBeans = Double.parseDouble(JOptionPane.showInputDialog(null, "How much?"));
                    selectedBeanProtein.printMessage(gramsOfBeans); break;
                }
                Double gramsOfVegetable  = Double.parseDouble(JOptionPane.showInputDialog(null, "How much?"));
                selectedVegetableProtein.printMessage(gramsOfVegetable);
                break;


            case "Diary products":
                ProteinSource[] diaryProtein = {new ProteinSource("Milk", 0.03), new ProteinSource("Swedish kvarg", 0.12),
                                                new ProteinSource("Cheese", 0.25)};

                ProteinSource selectedDiaryProtein = (ProteinSource) JOptionPane.showInputDialog(null, "What kind of diary?", "Protein Choise", JOptionPane.QUESTION_MESSAGE, null, diaryProtein, diaryProtein[0]);
                Double gramsOfDiary = Double.parseDouble(JOptionPane.showInputDialog(null, "How much?"));
                selectedDiaryProtein.printMessage(gramsOfDiary);

        }
    }

}
