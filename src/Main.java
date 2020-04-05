
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertPhoneNumber("1-800-FLOWERS"));
    }

    public static String convertPhoneNumber(String s) {
        String newNumber = "";
        String[] arrOfStr = s.split("-");

        for (String a : arrOfStr) {
            if (checkIfNumeric(a)) {
                newNumber = newNumber + a + "-";
            }

            if (!checkIfNumeric(a)) {
                String[] arr = a.split("");
                for (String character : arr) {
                    switch (character.toLowerCase()) {
                        case "a":
                        case "b":
                        case "c":
                            newNumber += 2;
                            break;
                        case "d":
                        case "e":
                        case "f":
                            newNumber += 3;
                            break;
                        case "g":
                        case "h":
                        case "i":
                            newNumber += 4;
                            break;
                        case "j":
                        case "k":
                        case "l":
                            newNumber += 5;
                            break;
                        case "m":
                        case "n":
                        case "o":
                            newNumber += 6;
                            break;
                        case "p":
                        case "q":
                        case "r":
                        case "s":
                            newNumber += 7;
                            break;
                        case "t":
                        case "u":
                        case "v":
                            newNumber += 8;
                            break;
                        case "w":
                        case "x":
                        case "y":
                        case "z":
                            newNumber += 9;
                    }
                }
            }
        }
            return newNumber;
        }


    public static boolean checkIfNumeric (String s) {
        boolean numeric = true;
        try {
            Integer num = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            numeric = false;
        }
        if(numeric){
            return true;
        }
        return false;
    }


    public static void CorrectAnswers (String[]answers, String[][]studentAnswers){
        int counter = 0;

        for(int i=0; i < studentAnswers.length; i++){
            for(int j = 0; j < answers.length; j++){
                if(studentAnswers[i][j].equalsIgnoreCase(answers[j])){
                    counter++;
                }
            }

            System.out.println(counter + "/" + answers.length + " Student:" + (i+1));
            counter = 0;
        }
    }
}



/*  Desert[] orders = new Desert[5];

        orders[0] = new IceCream("cup", "vanilla", 2, 2);
        orders[1] = new IceCream("cup", "strawberry", 1, 2);
        orders[2] = new IceCream("cone", "strawberry", 3, 2);

        orders[3] = new Cake(10, "vanilla", true);

        orders[4] = new Candy(30, "strawberry");

        double totalAmount = 0;
        for(Desert d : orders) {
            totalAmount = totalAmount + d.Price();
        }

        System.out.println(totalAmount);
    }

 */