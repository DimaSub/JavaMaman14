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
        if (mat[0][0] > num || mat[mat.length - 1][mat.length - 1] < num) return false;

        if (mat[0][0] <= num && mat[mat.length / 2][0] >= num) {
            return true;
        }

        if (mat[0][(mat.length / 2) + 1] <= num && mat[mat.length / 2][(mat.length / 2) + 1] >= num) {
            return true;
        }


        return true;
    }

    private static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}

