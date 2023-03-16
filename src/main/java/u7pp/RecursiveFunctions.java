package u7pp;

/**
 * takes in integer
 * returns double that's the factorial of given integer
 * to calculate factorial, multiply current integers with all numbers less than it
 */
public class RecursiveFunctions {
    public static double factorial(int n) {
        if(n == 0) {
            return 1;
        } 
        else {
            return n * factorial(n - 1);
        }
    }

    /**
     * takes in base and power val
     * use pow function to multiply base with base raised to power lower than original val
     */
    public static double pow(double base, int power) {
        if(power == 0) {
            return 1;
        } 
        else {
            return base * pow(base, power - 1);
        }
    }

    /**
     * takes in integer
     * if number = 1, no fibonacci sequence
     * check that integer increases by 1 while being added to integer before it
     */
    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } 
        else if(n == 1) {
            return 1;
        } 
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * takes in string
     * checks whether or not first character of word matches the one at end of string
     * returns true if string = palindrome
     * otherwise, returns false
     */
    public static boolean isPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        } 
        else if(s.charAt(0) == s.charAt(s.length() - 1)){
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        else {
            return false;
        }
    }

    /**
     * checks if next integer in order is double of original integer
     */
    public static int nextIsDouble(int[] arr, int i) {
        if(i >= arr.length - 1) {
            return 0;
        } 
        else if(arr[i] * 2 == arr[i + 1]) {
            return 1 + nextIsDouble(arr, i + 1);
        } 
        else {
            return nextIsDouble(arr, i + 1);
        }
    }
    
    /**
     * takes in integer
     * returns string of its binary val
     */
    public static String getBinary(int n) {
        if(n == 0) {
            return "0";
        } 
        else if(n == 1) {
            return "1";
        } 
        else if(n % 2 == 0) {
            return getBinary(n / 2) + "0";
        } 
        else {
            return getBinary(n / 2) + "1";
        }
    }        

    /**
     * checks if integers are in middle
     * takes in array and val
     * if val is in array = return index of val
     * otherwise, returns -1
     */
    public static int binarySearch(int[] arr, int value, int low, int high) {
        if (low > high) {
            return -1;
        }
        
        int mid = (low + high) / 2;
        
        if(arr[mid] == value) {
            return mid;
        } 
        else if(arr[mid] > value) {
            return binarySearch(arr, value, low, mid - 1);
        } 
        else { // arr[mid] < value
            return binarySearch(arr, value, mid + 1, high);
        }
    }    

    /**
     * returns true if drop of water starting @ location specified...
     * ...by row/column can reach edge of map 
     * otherwise, returns false
     */
    public static boolean canFlowOffMap(int[][] map, int row, int col) {
        if(row + 1 >= map.length || row - 1 < 0 || col + 1 >= map[0].length || col - 1 < 0){
            return true;
        }
        //left
        else if(map[row][col - 1] < map [row][col] && canFlowOffMap(map, row, col - 1)){
            return true;
        }
        //right
        else if(map[row][col + 1] < map [row][col] && canFlowOffMap(map, row, col + 1)){
            return true;
        }
        //up
        else if(map[row - 1][col] < map [row][col] && canFlowOffMap(map, row - 1, col)){
            return true;
        }
        //down
        else if(map[row + 1][col] < map [row][col] && canFlowOffMap(map, row + 1, col)){
            return true;
        }
        //if no path to border found
        else {
            return false;
        }
    }
}