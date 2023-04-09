package Zdrowie;

import java.util.Scanner;

public class Wczytywanie {
    Scanner scanner = new Scanner(System.in);

    double getWaga() {
        System.out.println("Ile ważysz?");

        double weight_ = scanner.nextDouble();
        return weight_;
    }
    double getHeight() {
        System.out.println("Ile masz wzrostu? ");
        double height_ = scanner.nextDouble();
        return height_;
    }
        boolean getMale(){
        System.out.println("Czy jesteś mężczyzną? true/false");
    boolean man_ = scanner.nextBoolean();
    return man_;
    }
    int getAge_() {
        System.out.println("Podaj swój wiek: ");
        int age_ = scanner.nextInt();
        return age_;
    }
    int getWybor() {
        System.out.println("");
        System.out.println("Określ swoją aktywność: ");
        System.out.println("1. Siedzący ");
        System.out.println("2. Lekko aktywny - jeśli ćwiczysz lekko od jednego do trzech dni w tygodniu ");
        System.out.println("3. Umiarkowanie aktywny - jeśli ćwiczysz umiarkowanie od trzech do pięciu dni w tygodniu ");
        System.out.println("4. Bardzo aktywny - jeśli intensywnie ćwiczysz przez sześć do siedmiu dni w tygodniu ");
        System.out.println("5. Ekstra aktywny - jeśli wykonujesz bardzo ciężkie ćwiczenia przez sześć do siedmiu dni w tygodniu lub wykonujesz pracę fizyczną ");
        int wybor_ = scanner.nextInt();
        return wybor_;
    }
    int getDecision_() {
        System.out.println("");
        System.out.println("Określ swój cel: ");
        System.out.println("1. Chcę schudnąc ");
        System.out.println("2. Chcę utrzymać wagę ");
        System.out.println("3. Chcę zwiększyć masę ");
        int decision_ = scanner.nextInt();
        return decision_;
    }

}
