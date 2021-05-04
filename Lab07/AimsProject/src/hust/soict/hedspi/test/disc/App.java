package hust.soict.hedspi.test.disc;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static int U = 1;
    public static int D = 2;
    public static int R = 3;
    public static int L = 4;
    public static int min = -1;
    public static int[] start;
    public static int[] end;
    public static int total = 0;

    public static void main(String[] args) {

        String input[][] =new String[][] {
                {"s", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."}
        };
        String newInput[][] =new String[][] {
                {"s", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."}
        };
        start = new int[]{0, 0};
        end = new int[]{input.length-1, input[0].length-1};
//        String [][] newInput = input;
        System.out.println(input +  " " + newInput);
        min = 3;//solve(newInput);
        System.out.println(min);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        int current = 0;
        long timeStart = System.currentTimeMillis();
        System.out.println(input.length + " : " + input[0].length);
        handle(input, current, start, -1);
        System.out.println(min + " : " + (System.currentTimeMillis() - timeStart));
        System.out.println(total);

    }

    public static int[][] getDir(int currentIndex[], int input[][]) {

        return null;
    }

    public static boolean check(int i, int j, String[][] map) {
        return i >= 0 && i < map.length && j >= 0 && j < map[0].length && map[i][j] == ".";
    }

    public static int solve(String[][] map) {
        int m = -1;
        int[] drow = {1, 0, -1, 0};
        int[] dcol = {0, 1, 0, -1};
        int[][] d = new int[1000][1000];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {

            int[] u = queue.poll();
            for (int k = 0; k < 4; ++k) {
                int ni = u[0] + drow[k];
                int nj = u[1] + dcol[k];
                if (!check(ni, nj, map))
                    continue;
                queue.add(new int[]{ni, nj});
                map[ni][nj] = "#";
                d[ni][nj] = k + 1;
            }
        }
        if (d[end[0]][end[1]] >= 1 && d[end[0]][end[1]] <= 4) {
            m = 1;
            StringBuilder t = new StringBuilder();
            while ((start[0] ^ end[0]) != 0 || (start[1] ^ end[1]) != 0) {
                t.append(d[end[0]][end[1]] - 1);
                int dd = (d[end[0]][end[1]] - 1) ^ 2;
                end[0] += drow[dd];
                end[1] += dcol[dd];
            }
            for (int i = 1; i < t.length(); i++) {
                if(t.charAt(i) != t.charAt(i-1)) ++m;
            }
        }
        return m;
    }


    public static void handle(String[][] input, int current, int current_index[], int pre) {
        ++total;
        int x;
        int t;
        if (min > 0 && current >= min) return;
        if (current_index[0] == end[0] && current_index[1] == end[1])
            min = current;
        //U D R L
//       int arr[][] = { {current_index[0] - 1, current_index[1]},{current_index[0] + 1, current_index[1]}, {current_index[0], current_index[1] + 1}, {current_index[0] + 1, current_index[1] - 1}};
        if (current_index[0] + 1 < input.length && input[current_index[0] + 1][current_index[1]] == ".") {
            t = (pre == -1 || pre != D) ? current + 1 : current;
            x = (pre == -1 || pre != D) ? D : pre;
            input[current_index[0] + 1][current_index[1]] = "#";
            handle(input, t, new int[]{current_index[0] + 1, current_index[1]}, x);
            input[current_index[0] + 1][current_index[1]] = ".";
        }
        if (current_index[0] - 1 > -1 && input[current_index[0] - 1][current_index[1]] == ".") {
            t = (pre == -1 || pre != U) ? current + 1 : current;
            x = (pre == -1 || pre != U) ? U : pre;
            input[current_index[0] - 1][current_index[1]] = "#";
            handle(input, t, new int[]{current_index[0] - 1, current_index[1]}, x);
            input[current_index[0] - 1][current_index[1]] = ".";
        }
        if (current_index[1] + 1 < input[0].length && input[current_index[0]][current_index[1] + 1] == ".") {
            t = (pre == -1 || pre != R) ? current + 1 : current;
            x = (pre == -1 || pre != R) ? R : pre;
            input[current_index[0]][current_index[1] + 1] = "#";
            handle(input, t, new int[]{current_index[0], current_index[1] + 1}, x);
            input[current_index[0]][current_index[1] + 1] = ".";
        }
        if (current_index[1] - 1 > -1 && input[current_index[0]][current_index[1] - 1] == ".") {
            t = (pre == -1 || pre != L) ? current + 1 : current;
            x = (pre == -1 || pre != L) ? L : pre;
            input[current_index[0]][current_index[1] - 1] = "#";
            handle(input, t, new int[]{current_index[0], current_index[1] - 1}, x);
            input[current_index[0]][current_index[1] - 1] = ".";
        }
    }
}