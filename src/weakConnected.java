import java.util.Scanner;



public class weakConnected {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        boolean[] visited = new boolean[n];
        if (n > 0) {
            dfs(0, matrix, visited);
        }

        boolean connected = true;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                connected = false;
                break;
            }
        }
        if(connected){
            System.out.println("YES");
        } else  {
            System.out.println("NO not weakly connected");
        }
        input.close();
    }

    public static void dfs(int current, int[][] matrix, boolean[] visited){
        visited[current] = true;

        for (int next = 0; next < matrix.length; next++) {
            if(!visited[next] && (matrix[current][next] != 0 || matrix[next][current] != 0)) {
                dfs(next, matrix, visited);
            }
        }
    }
}
