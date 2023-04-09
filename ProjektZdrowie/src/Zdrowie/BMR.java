package Zdrowie;


public class BMR extends Person{

    final boolean man;
    final int age;
    final int wybor;
    BMR(double bodyWeight, double height, boolean man, int age,int wybor){

        super(bodyWeight,height);
        this.age=age;
        this.man=man;
        this.wybor=wybor;

    }

    int calcBMR(){
        double yourBMR;
        int wynik;
        if(man){
            yourBMR=66+(13.7*bodyWeight)+(5*height)-(6.8*age);
        }else{
            yourBMR=655+(9.6*bodyWeight)+(1.8*height)-(4.7*age);
        }
        yourBMR=(Math.round(yourBMR));
        wynik=(int)yourBMR;
        return wynik;
    }
    double getActivity(int wybor){


        double act=0;
        switch(wybor){
            case 1:
                act=1.2;
                break;
            case 2:
                act=1.375;
                break;
            case 3:
                act=1.55;
                break;
            case 4:
                act=1.725;
                break;
            case 5:
                act=1.9;
                break;
        }
        return act;
    }

    int totalBMR(){
        double activty=getActivity(wybor);
        double total_pre_BMR=calcBMR()*activty;
        int total_BMR=(int)total_pre_BMR;
        return total_BMR;

    }

}
