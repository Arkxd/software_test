package 计算器;

public class Main {
    public static void main(String[] args) {

    }
    public int add(int a,int b){
        return a + b;
    }
    //减
    public int sub(int a,int b){
        return a - b;
    }
    //乘
    public int multiply(int a,int b){
        return a * b;
    }
    //除
    public int divide(int a,int b) throws Exception {
        if(b == 0)
        {
            throw new Exception("除数不能为0");
        }
        return a / b;
    }
}