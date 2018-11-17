public class ClassOne {
    private int num1;
    private int num2;
    ClassOne(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int sum(){
        return num1 + num2;
    }
    public int addition(){
        return num2 * num1;
    }
    public static int factorial(int number){
        if(number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }
}