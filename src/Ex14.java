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
     * @param a The given array to check the numbers within.
     * @param x First number to look for in the array.
     * @param y Second number to look for in the array.
     * @return an Integer of the minimum distance, or Integer.MAX_VALUE in case one or both of the numbers missing.
     */
    public static int findMinDiff (int[] a, int x, int y){
        int previousCell =- 1, minDistance = Integer.MAX_VALUE;

        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] == x || a[i] == y)
            {
                if(previousCell != -1 && a[i] != a[previousCell])
                    minDistance = Math.min(minDistance,i-previousCell);
                previousCell = i;
            }
        }

        return minDistance;
    }
}
