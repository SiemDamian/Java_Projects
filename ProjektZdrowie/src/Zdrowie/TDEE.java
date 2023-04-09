package Zdrowie;

public class TDEE extends BMR{
    int decision;

    TDEE(double bodyWeight, double height, boolean man, int age,int wybor,int decision){

        super(bodyWeight,height,man,age,wybor);

        this.decision=decision;
    }
    int getTDEE(){
        double act=0;
        double test=0;
        int TDEE;
        int b = totalBMR();
        switch(decision){

            case 1:
                test=b-b*7.5/100;
                break;
            case 2:
                test=b;
                break;
            case 3:
                test=b+b*7.5/100;
                break;

        }
        TDEE=(int)(test);
        return TDEE;
    }
}
