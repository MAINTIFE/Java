// public class SwitchCase{
//     public static void main(String[] args){
//     int n = 2;
//     if (n==2)
//     System.out.println("n is 2");
//     else if (n<=2)
//     System.out.println("n is still 2");
//     else
//     System.out.println("it can't be 2");
//     }
// }

public class SwitchCase{
    public static void main(String[] args){
        int n = 7;
        switch (n){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Enter a valid number");
        }
    }
}