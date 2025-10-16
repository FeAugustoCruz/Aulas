package aulasala5;

/**
 *
 * @author fernando
 */
public class TesteVetores {
    private String nome;

    public static void main(String[] args) {
        int[][] mat = new int[3][3];

        mat[0] = new int[3];
        mat[1] = new int[3];
        mat[2] = new int[3];

        // Imprimir os valores da matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("mat[" + i + "][" + j + "] = " + mat[i][j]);
            }
        }
    }
}