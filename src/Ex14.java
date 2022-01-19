/**
 * Maman 14 - Class Ex14
 * @author Dima Subotin - ID: 311626519
 * @version 18/1/22
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
     * Time complexity of the method: O(n) - the method goes through the array only once.
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

        for (int i=0 ; i<10 ; i++) {
            if (mat[lowX][lowY] > num || mat[highX][highY] < num) return false;
            //Checks if number is in top part
            if (num >= mat[lowX][lowY] && num <= mat[midX][midY]) {
                highX = midX;
                highY = midY;
                midX = highX;
                midY = lowY;
                //Checks if number is in left part
                if (num >= mat[lowX][lowY] && num <= mat[midX][midY]){
                    highX = midX;
                    highY = lowY;
                }
                //Case number is in right part
                else{
                  lowY = highY;
                }
                midX = (lowX+highX)/2;
                midY = lowY+midX+1;

            }
            //Case number is in bottom part
            else{

            }
        }
    }
}

