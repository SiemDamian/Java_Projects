package Zdrowie;

public class Ingredients extends TDEE{

    final double whey = 1.1;

    Ingredients(double bodyWeight, double height, boolean man, int age,int wybor,int decision){

        super(bodyWeight,height,man,age,wybor,decision);

    }

    int totalTDEE = getTDEE();

    double getCarbo(){

        return 4*bodyWeight;
    }
    double getWhey(){

        return 1.5*bodyWeight;
    }
    double getFat(){
        return 1.1*bodyWeight;
    }
}
