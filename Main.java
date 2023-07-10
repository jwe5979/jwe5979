//전철우

public class Main {

    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.print(j + "*" + i + "=" + String.format("%3d", i * j));
                        System.out.print("   ");
                    }
                    System.out.println();
                }
        }
    }