public class While {
    public static void main(String[] args){
        int i=1;
        while (i<=5){
            System.out.println("DAY " + i);
            i++;

            int j=1; 
            while (j<=9){
                System.out.println("  " + (j+8) + "-" + (j+9));
                j++;
            } 
        }
    }
}
