package kr.seoul42;

public class GameUtil {
    public static int stoi(String[] data, int idx) {
        return Integer.parseInt(data[idx]);
    }

    public static void printStringArray(String[] tokens) {
        for (var t: tokens) {
            System.out.print(t + ",");
        }
        System.out.println();
    }
}
