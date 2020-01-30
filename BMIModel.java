package e.omirza.bmicalculator;

import static ca.roumani.i2c.Utility.m2FtInch;

public class BMIModel {
    private double weight;
    private double height;

    public BMIModel(String w, String h){
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    public String getBMI(){
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.1f", index);
        return result;
    }

    public String toPound(){
        double weightPounds;
        weightPounds = this.weight * (1/0.454);
        String pounds = String.format("%.0f", weightPounds);
        return pounds;
    }

    public String toFeetInch(){
        String imperialHeight = m2FtInch(this.height);
        return imperialHeight;
    }

    public static void main(String[] args) {
        BMIModel myModel = new BMIModel("90", "1.8");
        System.out.println(myModel.getBMI() + "Your weight in pounds is " + myModel.toPound() + "and your height is " + myModel.toFeetInch());
    }

}
