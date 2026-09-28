package JAVA.Pyramid;

/*
------------------
 *
 * *
 * * *
 * * * *
 * * * * *
 ------------------
 */
public class starPyramid2 {
    public static void main(String[] args) {
        int n =5;
        //outer loop
        for (int i = 1; i <=n; i++) {

            //loop for the spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }

            //loop for star
            for (int j = 1; j <=i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
