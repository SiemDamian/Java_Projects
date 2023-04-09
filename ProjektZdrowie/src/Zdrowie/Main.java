package Zdrowie;

import Zdrowie.BMI;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        boolean closeProgram=true;
        while (closeProgram) {

            Wczytywanie wczyt = new Wczytywanie();
            double weight_ = wczyt.getWaga();
            double height_ = wczyt.getHeight();
            boolean man_ = wczyt.getMale();
            int age_ = wczyt.getAge_();
            int wybor_ = wczyt.getWybor();
            int decision_ = wczyt.getDecision_();
            boolean a=true;
            while (a) {
                BMI bmi = new BMI(weight_, height_);
                Scanner scanner = new Scanner(System.in);
                TDEE tdee = new TDEE(weight_, height_, man_, age_, wybor_, decision_);
                Ingredients ingredients = new Ingredients(weight_, height_, man_, age_, wybor_, decision_);
                System.out.println("");
                System.out.println("");
                System.out.println("Co chcesz policzyć?");
                System.out.println("1. BMI ");
                System.out.println("2. BMR - Podstawowa przemiana materii ");
                System.out.println("3. Całkowita przemiana materii ");
                System.out.println("4. TDEE - ile kalorii bu schudnąć/przytyć/utrzymać wage ");
                System.out.println("5. Oblicz składniki odżywcze ");
                System.out.println("6. Zmień dane ");
                System.out.println("7. Zakończ program ");

                int decision_2 = scanner.nextInt();

                switch (decision_2) {
                    case 1:
                        System.out.println();
                        System.out.print("Twoje BMI wynosi: ");
                        System.out.print(" " + bmi.calcBMI());
                        bmi.conclusionsBMI();
                        break;
                    case 2:
                        System.out.println();
                        System.out.print("Twoje BMR wynosi: ");
                        System.out.print(tdee.calcBMR());
                        break;
                    case 3:
                        System.out.println();
                        System.out.print("Twoja całkowta przemiana materii wynosi: ");
                        System.out.print(tdee.totalBMR());
                        break;
                    case 4:
                        System.out.println();
                        System.out.print("Twoje TDEE: ");
                        System.out.print(tdee.getTDEE());
                        break;
                    case 5:
                        System.out.println();
                        System.out.println("Twoje zapotrzebowanie na: ");
                        System.out.print("Białko: ");
                        System.out.print(ingredients.getWhey());
                        System.out.print(" g");
                        System.out.println();
                        System.out.print("Węglowodany: ");
                        System.out.print(ingredients.getCarbo());
                        System.out.print(" g");
                        System.out.println();
                        System.out.print("Tłuszcze: ");
                        System.out.print(ingredients.getFat());
                        System.out.print(" g");

                        break;
                    case 6:
                        a=false;
                        break;
                    case 7:
                        System.exit(0);

                }


            }

        }
    }


    }




