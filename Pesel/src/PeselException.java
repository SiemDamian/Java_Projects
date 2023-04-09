enum PeselCode
{
    NIEPOPRAWNY_FORMAT_LICZBY(1),
    NIEPOPRAWNY_FORMAT_MIES(2),
    ZLY_ROK_PRZESZLY(3),

    ZLY_ROK_PRZYSZLY(4),
    ZLY_ROK(5);

    private int PeselCode;
    PeselCode( int PeselCode )
    {
        this.PeselCode = PeselCode;
    }
}

public class PeselException extends Exception
{
    private PeselCode mCode;
    PeselException( PeselCode mCode )
    {
        this.mCode = mCode;
    }

    public void getReason()
    {
        switch ( mCode )
        {
            case NIEPOPRAWNY_FORMAT_LICZBY: System.out.println("Miesiąc oraz dzień muszą być w formacie dwóch liczb,"+
                    " w przypadku np. 2 lutego to 02 jako dzień i 02 jako miesiąc, powtórz procedurę"); break;
            case NIEPOPRAWNY_FORMAT_MIES: System.out.println("Miesiące i dni muszą być zapisane w formie liczb. Luty to np. 02,"+
                    "a pażdziernik to 10"); break;
            case ZLY_ROK: System.out.println("Rok podany w złym formacie. Wymagany format np. 2001"); break;
            case ZLY_ROK_PRZESZLY: System.out.println("W roku, który podałeś/aś nie było jeszcze numerów PESEL"); break;
            case ZLY_ROK_PRZYSZLY: System.out.println("Po roku 2099 zasady przyznawania numerów PESEL się zmienią,"
            +" generator nie obsługuje tak odległych dat"); break;
            default: System.out.println("Mamy błąd, przeanalizuj swoje odpowiedzi"); break;
        }
    }
}