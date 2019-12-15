package controlflow;

public class UseNestedIfElse {

    public static void main(String[] args) {
        int age=28;
        if (age>18){
            System.out.println("You are Adult");

            if (age>10){
                System.out.println("You are Teenager");
            }else{
                System.out.println("you are not Teenager");
            }

        } else{
            System.out.println("You are not Adult");
        }

    }
}
