public class Main {

    public static void main(String[] args) {
        System.out.println(add(3,8));
        System.out.println(addTwo(3, 8, 4, 9));
        System.out.println(morningGreeting("Toby Fox"));
        System.out.println(afternoonGreeting("Mac Miller"));
        System.out.println(triple("oohbaby"));
        System.out.println(half(17));
        System.out.println(roundPositiveValueToNearestInteger(8.5));
        System.out.println(roundNegativeValueToNearestInteger(-8.49));

    }
        // 1. add
        public static int add(int a, int b){
            return a + b;
        }

        // 2. add
        public static int addTwo(int a, int b, int c, int d){
            return a + b + c + d;
        }

        // 3. morningGreeting
        public static String morningGreeting(String myName){
            return "早上好, " + myName + "!";
        }
        // 4. afternoonGreeting
        public static String afternoonGreeting(String myName){
            return "下午好, " + myName + "!";
        }
        // 5. triple
        public static String triple(String string){
            return string + string + string;
        }

        // 6. half
        public static double half(double myDouble){
            return myDouble / 2;
        }

        // 7. roundPositiveValueToNearestInteger
        public static int roundPositiveValueToNearestInteger(double myDouble){
            return (int) Math.round(myDouble);
        }
        // 8. roundNegativeValueToNearestInteger
        public static int roundNegativeValueToNearestInteger(double myDouble){
            return (int) Math.round(myDouble);
        }
}
