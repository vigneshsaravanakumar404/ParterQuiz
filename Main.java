public class Main{

    public static void main(String[] args) {
        

        // Define Lambda Expression
        Add add = (int x, int y) -> {
            int sum = 0;
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            return sum;
        };

        // Run Command and Catch Exceptions
       System.out.print(add(1,3));

        
    }
}