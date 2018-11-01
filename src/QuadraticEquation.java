import com.company.Main;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String  getResult(){
        double delta = 0;
        if (this.a == 0){
            if (this.b == 0){
                if (this.c == 0){
                    return "Vo so nghiem";
                }else {
                    return "Vo nghiem";
                }
            }else {
                return "PT co nghiem: " + -this.c/this.b;
            }
        }else {
            delta = Math.pow(this.b,2) - 4*this.a*this.c;
            if (delta < 0){
                return "PT vo nghiem";
            }else if (delta == 0){
                return "PT co 1 nghiem x: " + -this.b/(2*this.a);
            }else {
                return "PT co nghiem x1: " + ((-this.b + Math.sqrt(delta))/(2*a)) + "\n" + "PT co nghiem x2: " + ((-this.b - Math.sqrt(delta))/(2*a));
            }
        }
    }
}
