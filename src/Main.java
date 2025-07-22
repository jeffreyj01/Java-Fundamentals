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

        int month = 5;

        //Call Class Method to practice switch statement
        System.out.println(monthJoined(month));
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
