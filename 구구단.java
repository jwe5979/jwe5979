//전철우

public class Mini {

    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%02d",j) + "*" + String.format("%02d",i) + "=" + String.format("%02d", i * j));
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
