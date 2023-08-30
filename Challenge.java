public class Challenge {
    public static void main(String[] args){
    double p_weight = 7d;
    
    // one pound is equal to 0.45359237 kg. A constant
    double one_kg = 0.45359237;
    double result = p_weight * one_kg ;

    System.out.println(result);
    System.out.println(p_weight);

    boolean isCar = false;
    if (isCar) {
        System.out.println("This is not supposed to happen");
    }

    double doubleVariable = 25d;
    double doubleVariable2 = 80d;
    double result2 = (doubleVariable + doubleVariable2) * 100d;
    double result3 = result2 % 40d;
    
    // using the tenary operator
    boolean truOrFals = (result3 == 0) ? true : false;
    System.out.println(truOrFals);
    
    // to check if result3 has a remainder or the condition truOrFalse isn't met
    if(!truOrFals) {
        System.out.println("Got some remainder");
    }

    
}
     }