package controlflow;

public class UseSwitchCase {

    public static void main(String[] args) {
        int menuNumber=5;
        String foodName;

        switch (menuNumber){
            case 1: foodName="Pizza";
            break;
            case 2: foodName="Fuchka";
                break;
            case 3: foodName="Hotdog";
                break;
            case 4: foodName="Burger";
                break;
            case 5: foodName="Pasta";
                break;
            case 6: foodName="coffee";
                break;
            case 7: foodName="Stake";
                break;
            case 8: foodName="Gyro";
                break;
                default: foodName="Invalid Menu";
                break;
        }
        System.out.println("My Favourite food is "+foodName);





    }


}
