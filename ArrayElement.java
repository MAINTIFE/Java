// public class ArrayElement {
//     public static void main(String[] args){
//         int[] marks = new int[6];
//         marks[0] = 50;
//         marks[1] = 60;
//         marks[2] = 70;
//         marks[3] = 80;
//         marks[4] = 90;
//         marks[5] = 100;
//         for (int m:marks){
//             System.out.println(m);
//         }
    
//     }
    
// }

// Big 0 
// This is the metric we use in determining the runtime amnd memeory usage of our program.  0(1)- constant time
// 0(n)- linear time, 0(n^2)- quadratic time, 0(log n)- logarithmic time, 0(nlogn)- exponential time

// create a string of array and loop through it
public class ArrayElement{
    public static void main(String[] args){
    String[] marks = new String[4];
        marks[0] = "10";
        marks[1] = "20";
        marks[2] = "30";
        marks[3] = "40";
        for (String m:marks){
            System.out.println(m);
        }
           
    }
}