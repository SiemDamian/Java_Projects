package Zdrowie;

public class BMI extends Person {

    BMI(double bodyWeight, double height){

        super(bodyWeight,height);
    }
    public double calcBMI(){
    double bmi = 10000*bodyWeight/(height*height);

        return Math.round(bmi);
    }
    void conclusionsBMI(){
        if(calcBMI()<18.5){
            System.out.println("Masz niedowagę");
        }else if(calcBMI()>=18.5 && calcBMI()<=24.9){
            System.out.println("Waga jest prawidłowa");
        }else if(calcBMI()>=25 && calcBMI()<= 29.9){
            System.out.println("Masz nawagę");
        }else{
            System.out.println("Niestety cierpisz na otyłość");
        }
    }
}
