import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [][] graph = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                graph[i][j] = input.nextInt();
            }
        }
        System.out.println("How many cycles with length 4");

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    for (int d = 0; d < n; d++) {
                        if (a != b && a != c && a != d && b != c && b != d && c != d) {
                            if (graph[a][b] != 0 && graph[b][c] != 0 && graph [c][d] != 0 && graph[a][d] != 0) {
                                System.out.println("Cycles" + a + " " + b + " " + c + " " + d);
                            }
                        }
                    }
                }
            }
        }
        input.close();
    }
}
