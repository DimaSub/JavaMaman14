
/**
 *  Harel Erlich
 *  11/12/2021
 */
public class Ex14SearchTest2 extends Ex14
{
    public static void main (String [] args) {
        //check array size 4x4
        int [][] array2 = new int [][] {{1,2,5,6}, {4,3,8,7}, {13,14,9,10}, {16,15,12,11}};
        System.out.println ("**search test 2**\n**time complexity should be O(log n)**\n");
        System.out.println ("**array size 4x4**\n");
        System.out.println("correct:\nrow = 1\ncol = 2\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array2,8)+ "\n");
        System.out.println("correct:\nrow = 0\ncol = 0\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array2,1));
        System.out.println("correct:\nrow = 3\ncol = 2\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array2,12) + "\n");
        System.out.println("correct:\nrow = 3\ncol = 0\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array2,16) + "\n");
        System.out.println("correct:\nrow = 3\ncol = 3\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array2,11) + "\n");
        System.out.println("correct:\nrow = 1\ncol = 0\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array2,4) + "\n");
        System.out.println("correct:\nfalse");
        System.out.println ("Your answer:");
        System.out.println(search(array2,0) + "\n");
        System.out.println("correct:\nfalse");
        System.out.println ("Your answer:");
        System.out.println(search(array2,17) + "\n");

        //check array size 2x2
        int [][] array3 = new int [][] {{1,2}, {4,3}};
        System.out.println ("**array size 2x2**\n");
        System.out.println("correct:\nrow = 0\ncol = 0\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array3,1) + "\n");
        System.out.println("correct:\nrow = 0\ncol = 1\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array3,2) + "\n");
        System.out.println("correct:\nrow = 1\ncol = 1\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array3,3) + "\n");
        System.out.println("correct:\nrow = 1\ncol = 0\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array3,4) + "\n");
        System.out.println("correct:\nfalse");
        System.out.println ("Your answer:");
        System.out.println(search(array3,0) + "\n");
        System.out.println("correct:\nfalse");
        System.out.println ("Your answer:");
        System.out.println(search(array3,5));
    }
}
