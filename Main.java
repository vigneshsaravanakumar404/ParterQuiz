public class Main{

    interface Add {
        int sumBetween(int x, int y);
    }
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
        try{
            System.out.println(add.sumBetween(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
        } catch(Exception e){
            System.out.println("Ran error: " + e);
        }





        
    }
}