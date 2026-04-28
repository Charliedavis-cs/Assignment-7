import java.util.Scanner;

public class DrawGraph {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println("Empty graph");
            return;
        }

        String[] vertices = line.split("\\s+");
        int n = vertices.length;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int right = (i + (2 * i + 1)) % n;
            int left = (i - (2 * i + 2)) % n;

            if (left < 0) {
                left = left + n;
            }

            matrix[i][right] = 1;
            matrix[i][left] = 1;
        }

        System.out.println("Adjacency Matrix:");

        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + " : ");

            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        input.close();
    }
}