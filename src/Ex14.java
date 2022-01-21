/**
 * Maman 14 - Class Ex14
 * @author Dima Subotin - ID: 311626519
 * @version 22/1/22
 */

public class Ex14 {

    /**
     * A method that receives an array and 2 different numbers, the method calculates the minimum distance
     * between the indexes of the 2 numbers.
     * If one or both of the numbers not found in the array the method returns Integer.MAX_VALUE.
     * Time complexity of the method: O(n) - the method goes through the array only once.
     * Space complexity of the method: O(1) - No extra space needed outside of method.
     *
     * @param a The given array to check the numbers within.
     * @param x First number to look for in the array.
     * @param y Second number to look for in the array.
     * @return an Integer of the minimum distance, or Integer.MAX_VALUE in case one or both of the numbers missing.
     */
    public static int findMinDiff(int[] a, int x, int y) {
        int previousCell = -1, minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x || a[i] == y) {
                if (previousCell != -1 && a[i] != a[previousCell])
                    minDistance = Math.min(minDistance, i - previousCell);
                previousCell = i;
            }
        }

        return minDistance;
    }

    /**
     * A method that receives 2-d sorted circular array and a number.
     * The method then returns True value if the number found in the array or False otherwise.
     * Time complexity of the method: O(log n) - The methods cuts in half the search area with every step,
     * thus reminding the properties of a binary search, which also got the complexity of O(log n).
     * Space complexity of the method: O(1) - No extra space needed outside of method.
     *
     * @param mat A given 2-d sorted circular array.
     * @param num The number to search in the given array.
     * @return a Boolean expression, True if the number found in the array or False otherwise.
     */
    public static boolean search(int[][] mat, int num) {
        //values of initial squares corner and middle cells x coordinates
        int lowX = 0, highX = mat.length-1, midX = highX/2;
        //values of initial squares corner and middle cells y coordinates
        int lowY = 0, highY = 0, midY = midX+1;
        //value of currently inspected squares initial length
        int counter = mat.length;

        //Checks if the number is in squares range
        if (mat[lowX][lowY] > num || mat[highX][highY] < num) return false;

        while (counter!=1) {
            //Checks if number is in top part
            if (num >= mat[lowX][lowY] && num <= mat[midX][midY]) {
                highX = midX;
                highY = midY;
                midY = lowY;
                //Checks if number is in left part
                if (num >= mat[lowX][lowY] && num <= mat[midX][midY]){
                    highY = lowY;
                }
                //Case number is in right part
                else{
                  lowY = highY;
                }
            }
            //Case number is in bottom part
            else{
                midX = highX;
                midY = lowY;
                lowX = midX;
                //Checks if number is in right part
                if (num >= mat[lowX][lowY] && num <= mat[midX][midY]){
                    highY = midY;
                }
                //Case number is in left part
                else{
                    lowY = highY;
                }
            }
            if (num==mat[lowX][lowY] || num==mat[highX][highY]) return true;
            midY = lowY+(highX-lowX+1)/2;
            midX = (lowX+highX)/2;
            counter /= 2;
        }
        return false;
    }

    /**
     * A method that receives an array and checks if it can be divided into 2 equal groups.
     * Groups should be equal in their sums and their number of cells.
     *
     * @param arr The array to check.
     * @return Returns True if equal split is possible or False otherwise.
     */
    public static boolean equalSplit (int[] arr){
        if (arr.length%2!=0 || arr.length<2) return false;

        return sumArray(arr, 0, arr.length/2-1)==sumArray(arr, (arr.length/2), arr.length-1);
    }

    //Private method to sum array in a given range
    private static int sumArray(int[] arr, int i, int j)
    {
        if (arr.length<=j) return 0;
        if (i == j) return arr[i];
        return arr[j] + sumArray(arr ,i , j - 1);
    }

    /**
     * A method that receives a number and checks if the number considered a "magic number" by the assignment definitions.
     *
     * @param n The number to be checked.
     * @return Returns the value True if the number is magic or False otherwise.
     */
    public static boolean isSpecial (int n){
        if (n<1) return false;
        return isSpecial (n, 0, 0)==n;
    }

    //Private auxiliary method to run numbers from 1 to the input number by using the "magic number" algorithm.
    private static int isSpecial (int n, int round, int roundNum){
        round++;
        if (roundNum==n) return n;
        if (roundNum>n) return -1;
        return isSpecial(n, round, (round*round)-round+1);
    }
}

