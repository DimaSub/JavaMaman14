
/**
 *  Harel Erlich
 *  11/12/2021
 */
public class Ex14SearchTest1 extends Ex14 {
    public static void main (String [] args) {
        //check array size 8x8 
        String ans = "";
        int [][] array1 = new int [][] {{1,2,5,6,17,18,21,22},{4,3,8,7,20,19,24,23},{13,14,9,10,29,30,25,26},{16,15,12,11,32,31,28,27},
                {49,50,53,54,33,34,37,38},{52,51,56,55,36,35,40,39},{61,62,57,58,45,46,41,42},{64,63,60,59,48,47,44,43}};
        System.out.println ("**search test 1**\n");
        System.out.println ("**array size 8x8**\n");
        System.out.println("correct:\nrow = 1\ncol = 1\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,3) + "\n");
        System.out.println("correct:\nrow = 2\ncol = 2\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,15) + "\n");
        System.out.println("correct:\nrow = 3\ncol = 1\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,15) + "\n");
        System.out.println("correct:\nrow = 1\ncol = 5\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,19) + "\n");
        System.out.println("correct:\nrow = 0\ncol = 7\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,22) + "\n");
        System.out.println("correct:\nrow = 1\ncol = 3\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,7) + "\n");
        System.out.println("correct:\nrow = 1\ncol = 6\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,24) + "\n");
        System.out.println("correct:\nrow = 3\ncol = 6\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,28) + "\n");
        System.out.println("correct:\nrow = 3\ncol = 4\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,32) + "\n");
        System.out.println("correct:\nrow = 4\ncol = 0\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,49) + "\n");
        System.out.println("correct:\nrow = 5\ncol = 2\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,56) + "\n");
        System.out.println("correct:\nrow = 6\ncol = 2\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,57) + "\n");
        System.out.println("correct:\nrow = 4\ncol = 5\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,34) + "\n");
        System.out.println("correct:\nrow = 5\ncol = 6\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,40) + "\n");
        System.out.println("correct:\nrow = 7\ncol = 7\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,43) + "\n");
        System.out.println("correct:\nrow = 7\ncol = 4\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,48) + "\n");
        System.out.println("correct:\nrow = 7\ncol = 2\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,60) + "\n");
        System.out.println("correct:\nrow = 6\ncol = 4\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,45) + "\n");
        System.out.println("correct:\nrow = 7\ncol = 0\ntrue");
        System.out.println ("Your answer:");
        System.out.println(search(array1,64) + "\n");
        System.out.println("correct:\nfalse");
        System.out.println ("Your answer:");
        System.out.println(search(array1,0) + "\n");
        System.out.println("correct:\nfalse");
        System.out.println ("Your answer:");
        System.out.println(search(array1,65) + "\n");
    }
}