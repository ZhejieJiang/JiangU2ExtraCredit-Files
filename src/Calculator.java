public class Calculator {
    private double num1;
    private double num2;
    private String equation;


    public Calculator (String equation) {
        this.equation = equation;
    }
    public String add(){
         num1 = Double.parseDouble(equation.substring(0,equation.indexOf(" ")));
         num2 = Double.parseDouble(equation.substring(equation.indexOf(" ") + 3));
         if (Math.ceil(num1+num2) == Math.floor(num1+num2)){
             return Integer.toString((int)(num1+num2));
         }
         else {
             return Double.toString(num1+num2);
         }
    }

    public String subtract(){
        num1 = Double.parseDouble(equation.substring(0, equation.indexOf(" ")));
        num2 = Double.parseDouble(equation.substring(equation.indexOf(" ") + 3));
        if (Math.ceil(num1-num2) == Math.floor(num1-num2)){
            return Integer.toString((int)(num1-num2));
        }
        else {
            return Double.toString(num1-num2);
        }
    }

    public String multiply(){
        num1 = Double.parseDouble(equation.substring(0, equation.indexOf(" ")));
        num2 = Double.parseDouble(equation.substring(equation.indexOf(" ") + 3));
        if (Math.ceil(num1*num2) == Math.floor(num1*num2)){
            return Integer.toString((int)(num1*num2));
        }
        else {
            return Double.toString(num1*num2);
        }
    }

    public String divide(){
        num1 = Double.parseDouble(equation.substring(0, equation.indexOf(" ")));
        num2 = Double.parseDouble(equation.substring(equation.indexOf(" ") + 3));
        if (Math.ceil(num1/num2) == Math.floor(num1/num2)){
            return Integer.toString((int)(num1/num2));
        }
        else {
            return Double.toString(num1/num2);
        }
    }
    public String mod(){
        num1 = Double.parseDouble(equation.substring(0, equation.indexOf(" ")));
        num2 = Double.parseDouble(equation.substring(equation.indexOf(" ") + 3));
        if (Math.ceil(num1%num2) == Math.floor(num1%num2)){
            return Integer.toString((int)(num1%num2));
        }
        else {
            return Double.toString(num1%num2);
        }
    }

    public String exponent(){
        num1 = Double.parseDouble(equation.substring(0, equation.indexOf(" ")));
        num2 = Double.parseDouble(equation.substring(equation.indexOf(" ") + 3));
        if (Math.ceil(Math.pow(num1,num2)) == Math.floor(Math.pow(num1,num2))){
            return Integer.toString((int)(Math.pow(num1,num2)));
        }
        else {
            return Double.toString(Math.pow(num1,num2));
        }
    }
}




