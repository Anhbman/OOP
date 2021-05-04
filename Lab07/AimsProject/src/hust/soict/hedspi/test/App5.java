package hust.soict.hedspi.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Map {
    private int row;
    private int col;
    private int value;

    public Map(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getvalue() {
        return value;
    }

    public void setvalue(int value) {
        this.value = value;
    }
}

public class App5 {
    public static void main(String[] args) {
        String input[] = {"3 3",
                "g..",
                "##.",
                "s..",
        };
        System.out.println(solve(readFile(input)));
//        System.out.println(input.length);
//        System.out.println(input[0].length);

//        String[] lines = getStdin();
//        System.out.println(solve(readFile(lines)));
    }

    private static String[] getStdin() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines.toArray(new String[lines.size()]);
    }

    public static String[][] readFile(String[] lines){
        String[] a = lines[0].split("\\s");
        int row = Integer.parseInt(a[0]);
        int col = Integer.parseInt(a[1]);
        String[][] maze = new String[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                maze[i][j] = String.valueOf(lines[i+1].charAt(j));
                System.out.print(maze[i][j] );
            }
        }
        return maze;
    }

    public static boolean check(int row, int col, String[][] map) {
        return (row >= 0 && row < map.length && col >= 0 && col < map[0].length && map[row][col] != "#");
    }

    public static void print(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static int solve(String[][] map) {
//        int start[] = {0, 0};
        int[] start = new int[2];
        for (int i = 0; i < map.length ; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j].equals("s")){
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        Queue<Map> queue = new LinkedList<>();
        queue.add(new Map(start[0], start[1], 0));
        while (!queue.isEmpty()) {
            Map temp = queue.poll();
            int tempRow = temp.getRow();
            int tempCol = temp.getCol();
            int value = temp.getvalue();
            int check = 0;
            //xuong duoi
            while (check(++tempRow, tempCol, map)) {
//                System.out.println("duoi");
                if (map[tempRow][tempCol] == "g") {
                    map[tempRow][tempCol] = "@";
                    return value;
                }
                if (map[tempRow][tempCol] == "."){
                    if (check == 0){
                        value++;
                        check =1;
                    }
                    queue.add(new Map(tempRow, tempCol, value));
                    map[tempRow][tempCol] = "*";
//                    System.out.println("value : " + value +" " + tempRow +" " + tempCol);
//                    print(map);
                }
            }
            //sang phai
            tempRow = temp.getRow();
            tempCol = temp.getCol();
            while (check(tempRow, ++tempCol, map)) {
//                System.out.println("phai");
                if (map[tempRow][tempCol] == "g") {
                    map[tempRow][tempCol] = "@";
                    return value;
                }
                if (map[tempRow][tempCol] == "."){
                    if (check == 0){
                        value++;
                        check =1;
                    }
                    queue.add(new Map(tempRow, tempCol, value));
                    map[tempRow][tempCol] = "*";
//                    System.out.println("value : " + value +" " + tempRow +" " + tempCol);
//                    print(map);
                }
            }
            // len tren
            tempRow = temp.getRow();
            tempCol = temp.getCol();
            while (check(--tempRow, tempCol, map)) {
//                System.out.println("tren");
                if (map[tempRow][tempCol] == "g") {
                    map[tempRow][tempCol] = "@";
                    return value;
                }
                if (map[tempRow][tempCol] == "."){
                    if (check == 0){
                        value++;
                        check =1;
                    }
                    queue.add(new Map(tempRow, tempCol, value));
                    map[tempRow][tempCol] = "*";
//                    System.out.println("value : " + value +" " + tempRow +" " + tempCol);
//                    print(map);
                }
            }
            // sang trai
            tempRow = temp.getRow();
            tempCol = temp.getCol();
            while (check(tempRow, --tempCol, map)) {
//                System.out.println("trai");
                if (map[tempRow][tempCol] == "g") {
                    map[tempRow][tempCol] = "@";
                    return value;
                }
                if (map[tempRow][tempCol] == "."){
                    if (check == 0){
                        value++;
                        check =1;
                    }
                    queue.add(new Map(tempRow, tempCol, value));
                    map[tempRow][tempCol] = "*";
//                    System.out.println("value : " + value +" " + tempRow +" " + tempCol);
//                    print(map);
                }
            }
        }
        return -1;

    }
}