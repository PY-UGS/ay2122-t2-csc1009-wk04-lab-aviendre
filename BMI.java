import java.util.Scanner;

public class BMI {
    private double weight;
    private double height;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BMI bodyMassIndex = new BMI();


        System.out.print("Enter weight in pounds: ");
        bodyMassIndex.setWeight(input.nextDouble());
        System.out.print("Enter height in pounds: ");
        bodyMassIndex.setHeight(input.nextDouble());
        System.out.println("BMI is " + bodyMassIndex.BMICalculator());
        System.out.println(bodyMassIndex.BMICategory());

    }

    public BMI() {
    }

    public BMI(double weight, double height){}

    public double BMICalculator(){
        double h,w;
        h = this.height * 0.0254;
        w = this.weight * 0.45359237;
        h = h*h;
        return (w/h);

    }

    public String BMICategory(){
        double bmi = this.BMICalculator();
        if(bmi < 18.5)
        {
            return "Underweight";
        }
        else if (bmi < 25.0)
        {
            return "Normal";
        }
        else if (bmi < 30.0)
        {
            return "Overweight";
        }
        return "Obese";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI(){
        return 0;
    }

}

