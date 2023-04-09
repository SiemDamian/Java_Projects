import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Witaj w generatorze PESEL");
        System.out.println("Podaj dzień urodzenia: ");
        String day=scanner.nextLine();
        System.out.println("Podaj miesiąc urodzenia: ");
        String month=scanner.nextLine();
        System.out.println("Podaj rok urodzenia: ");
        String year=scanner.nextLine();

try {
    //day,month,year
    Pesel pesel = new Pesel(day, month, year);
    pesel.getPESEL();
}catch(PeselException e){
    e.getReason();
}

        //System.out.println(tablica[1]);
    }
}