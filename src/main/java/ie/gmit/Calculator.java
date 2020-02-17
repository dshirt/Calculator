/*John Lawless
    g00351835@gmit.ie
    Calculator maven test
    This is a file that adds two numbers
 */

package ie.gmit;

public class Calculator {

    private double num1;
    private double num2;
    private double result;

    public Calculator() {
        num1 = 0.0;
        num2 = 0.0;
    }

    public Calculator(double num1, double num2) {
        if(num1 == 0 || num2 == 0)
            throw new IllegalArgumentException("Must be greater than 0");
        else {
            this.num1 = num1;
            this.num2 = num2;
        }
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }


    public double addNumbers(double num1, double num2){
        result =  num1 + num2;
        return result;
    }

    public double subtractNumbers(double num1, double num2){
        result =  num1 - num2;
        return result;
    }

    public double multiplyNumbers(double num1, double num2){
        result =  num1 * num2;
        return result;
    }

    public double divideNumbers(double num1, double num2){
        result =  num1 / num2;
        return result;
    }

    @Override
    public String toString() {
        return "Calculator : " +
                + num1 +
                " " + num2 + " = " + result;
    }
}
