public class Main {
//Data types, variables, operators
//
//Conditionals: if/else, switch
//
//Loops: for, while, do-while
//
//Input/output

    /*
    Main Method
     */
    public static void main(String[] args) {

        //int month = 5;
        //Call Class Method to practice switch statement
        //System.out.println(monthJoined(month));

        //Array Practice
        int[] numbersOneToFive = {1, 2, 3, 4, 5 };
        for(int i : numbersOneToFive)
        {
            System.out.println(i);
        }

        System.out.println("--------------------------------");
        System.out.println();

        //Two Dimensional Array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

        System.out.println("--------------------------------");
        System.out.println();

        //Should print 3
        System.out.println(myNumbers[0][2]);

        System.out.println("--------------------------------");
        System.out.println();

        //Use recursion to add all of the numbers up to 10.
        int result = sum(10);
        System.out.println(result);

        System.out.println("--------------------------------");
        System.out.println();

        //Use recursion to add all of the numbers between 5 to 10.
        result = sum(5, 10);
        System.out.println(result);

    }

    private static int sum(int n) {
        if (n > 0)
        {
            return n + sum(n - 1);
        }
        else
        {
            return 0;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

        private static String monthJoined(int month) {

        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }
}
