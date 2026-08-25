// Task 2: Maximum 4-Digit Number from a Grid Path
// The problem

// You are given a board of N rows and M columns. Each field of the board contains a single digit (0-9).

// You want to find a path consisting of four neighboring fields. Two fields are neighboring if they share a common side. Also, the fields in your path should be distinct (you can't visit the same field twice).

// The four digits of your path, in the order in which you visit them, create an integer. What is the biggest integer that you can achieve in this way?

// Write a function that, given the board represented as a matrix of integers consisting of N rows and M columns, returns the biggest integer that you can achieve when concatenating the values in a path of length four.

// Examples:

// Given the following board (N=3, M=5):

// 9 1 1 0 7
// 1 0 2 1 0
// 1 9 1 1 0

// the function should return 9121.

// Given the following board (N=3, M=3):

// 1 1 1
// 1 3 4
// 1 4 3

// the function should return 4343.

// Given the following board (N=1, M=5):

// 0 1 5 0 0

// the function should return 1500.

// Assumptions:

// N and M are integers within the range [1..100]
// Each element of matrix Board is an integer within the range [0..9]
// There exists a path of length 4 which doesn't start with 0.

public class task2 {

    private static final int[] DR = {-1, 1, 0, 0};
    private static final int[] DC = {0, 0, -1, 1};

    public int solution(int[][] Board) {
        int N = Board.length;
        int M = Board[0].length;
        boolean[][] visited = new boolean[N][M];
        int[] path = new int[4];
        int best = -1;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                visited[r][c] = true;
                path[0] = Board[r][c];
                best = dfs(Board, visited, r, c, path, 1, best, N, M);
                visited[r][c] = false;
            }
        }
        return best;
    }

    private int dfs(int[][] board, boolean[][] visited, int r, int c,
                     int[] path, int depth, int best, int N, int M) {
        if (depth == 4) {
            int val = path[0]*1000 + path[1]*100 + path[2]*10 + path[3];
            return Math.max(best, val);
        }
        for (int i = 0; i < 4; i++) {
            int nr = r + DR[i], nc = c + DC[i];
            if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc]) {
                visited[nr][nc] = true;
                path[depth] = board[nr][nc];
                best = dfs(board, visited, nr, nc, path, depth + 1, best, N, M);
                visited[nr][nc] = false;
            }
        }
        return best;
    }
    
}
