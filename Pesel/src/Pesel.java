import java.util.Random;

public class Pesel {


    final private String day;
    final private String month;
    final private String year;

    Pesel(String day, String month, String year) throws PeselException{
            if(month.length()!=2 || day.length()!=2){
                throw new PeselException(PeselCode.NIEPOPRAWNY_FORMAT_MIES);
            } else if (year.length()!=4) {
                throw new PeselException(PeselCode.ZLY_ROK);
            }
            this.day=day;
            this.month=month;
            this.year=year;
    }
    char[] getChar() throws PeselException{

    char[] tablicaDay = day.toCharArray();
    char[] tablicaMonth = month.toCharArray();
    char[] tablicaYear = year.toCharArray();

    if(tablicaYear[0]=='1'&& tablicaYear[1]!='9'){
        throw new PeselException(PeselCode.ZLY_ROK_PRZESZLY);
    }else if(tablicaYear[0]=='2'&& tablicaYear[1]!='0'){
        throw new PeselException(PeselCode.ZLY_ROK_PRZYSZLY);
    }


    char[] dane = new char[]{tablicaYear[2], tablicaYear[3], tablicaMonth[0], tablicaMonth[1], tablicaDay[0], tablicaDay[1]};
    //System.out.println(dane);

        return dane;

    }

    char[] getRandom(){
        int[] tab = new int[5];

        Random r = new Random();
            for(int i=0;i<5;i++)
            {
                tab[i]=r.nextInt(10);
            }

        String r1 = Integer.toString(tab[0]);
        String r2 = Integer.toString(tab[1]);
        String r3 = Integer.toString(tab[2]);
        String r4 = Integer.toString(tab[3]);
        String r5 = Integer.toString(tab[4]);

        char t1 = r1.charAt(0);
        char t2 = r2.charAt(0);
        char t3 = r3.charAt(0);
        char t4 = r4.charAt(0);
        char t5 = r5.charAt(0);
        char[] git = new char[]{t1,t2,t3,t4,t5};

        return git;

        }
    void getPESEL() throws PeselException{
        System.out.println("Twój Pesel to: ");
        char[] tablicaYear2 = year.toCharArray();
        char[] tablicaMonth2 = month.toCharArray();
try {
    char[] x = getChar();

    if (tablicaYear2[0] == '2') {
        switch (tablicaMonth2[0]) {
            case '0':
                x[2] = '2';


            case '1':
                if (tablicaMonth2[0] == '1' && tablicaMonth2[1] == '0') {
                    x[2] = '3';
                    x[3] = '0';


                } else if (tablicaMonth2[0] == '1' && tablicaMonth2[1] == '1') {
                    x[2] = '3';
                    x[3] = '1';


                } else if (tablicaMonth2[0] == '1' && tablicaMonth2[1] == '2') {
                    x[2] = '3';
                    x[3] = '2';

                }

        }
    }
    System.out.println();
    System.out.print(x);
    System.out.print(getRandom());
    System.out.println();
        }catch(ArrayIndexOutOfBoundsException e){
            throw new PeselException(PeselCode.NIEPOPRAWNY_FORMAT_LICZBY);
        }
    }
}


