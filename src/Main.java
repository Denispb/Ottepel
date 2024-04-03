import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputArray();


    }
    public static void readArray(int[] m) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int t=0;
        System.out.println("введите температуру " + m.length + " дней");
        for (int i = 0; i < m.length; i++) {
            value = scanner.nextInt();
            m[i] = value;
            if (m[i]>0) {
            t++; }
            else t=0;


        }
        System.out.println("Теплых дней было " +t);
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите период");
        int size = scanner.nextInt();
        int[] m = new int[size];
        readArray(m);
        return m;
    }


    }

