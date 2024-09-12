/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Elise
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int addition = add(3,8);
        System.out.println(addition);

        int theSum = add(3,8,4,9);
        System.out.println(theSum);

        String theMorningGreeting = morningGreeting("Toby Fox");
        System.out.println(theMorningGreeting);

        String theAfternoonGreeting = afternoonGreeting("Mac Miller");
        System.out.println(theAfternoonGreeting);

        String theLyricTriple = triple("oohbaby");
        System.out.println(theLyricTriple);

        double inHalf= half(8);
        System.out.println(inHalf);

        int integerValue = roundPositiveValueToNearestInteger(8.5);
        System.out.println(integerValue);

        int theNegativeInteger= roundNegativeValueToNearestInteger(-8.5);
        System.out.println(theNegativeInteger);
    }

    // 1. add
    public static int add(int firstNum,int secondNum){
        return firstNum + secondNum;
    }
    
    // 2. add
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int firstSum = add(numOne,numTwo);
        int secondSum = add(numThree,numFour);
        int totalSum = add(firstSum,secondSum);
        return totalSum;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name+"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name+"!";
    }

    // 5. triple
    public static String triple(String theLyric){
        return theLyric+theLyric+theLyric;
    }

    // 6. half
    public static double half(int integer){
        return integer/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double decimal){
        int roundedValue = (int)Math.round(decimal);
        return roundedValue;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negativeDecimal){
        int nearestInteger = (int)Math.round(negativeDecimal);
        return nearestInteger;
    }

}
