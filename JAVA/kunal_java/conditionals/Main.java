public class Main {
    public static void main(String[] args){
        /*
         * syntax of if statement 
         * if (boolean expression T or F) {
         *  body
         * } else {
         * do this
         * }
         * 
         */
        int salary = 2500;
        if (salary >= 1000){
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println("the new salary is " + salary);
    }
}