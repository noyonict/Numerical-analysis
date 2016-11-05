package gaussianelimination;

/**
 *
 * @author noyon
 */
public class GaussianElimination {

    public static void main(String[] args) {
        GaussianElimination ge = new GaussianElimination();
        int array[][] = {{1, 3, -5, 2}, {3, 11, -9, 4}, {-1, 1, 6, 3}};
        System.out.println("Initial value: ");
        ge.display_matrix(array);
        int arrayLength = array.length;
        System.out.println(arrayLength + " ");
        int firstZero = array[1][0];
        int secondZero = array[2][0];
        for (int i = 0; i <= array.length; i++) {
            array[1][i] = array[1][i] - ((array[0][i] / array[0][0]) * firstZero);
            array[2][i] = array[2][i] - ((array[0][i] / array[0][0]) * secondZero);
            if (i >= arrayLength) {
                System.out.println("\nFirst step: ");
                ge.display_matrix(array);
                int thirdZero = array[2][1];
                for (int k = 1; k < array[arrayLength - 1].length; k++) {
                    array[2][k] = array[2][k] - ((array[1][k] / array[1][1]) * thirdZero);
                }
                System.out.println("\nSecond step: ");
                ge.display_matrix(array);
            }
        }

        

    }

    public void display_matrix(int[][] array) {
        for (int[] array1 : array) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array1[j] + "  \t");
            }
            System.out.println("");
        }
    }

}
