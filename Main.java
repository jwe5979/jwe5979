//전철우

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");

        Scanner sc = new Scanner(System.in);
        System.out.print("결제 금액을 입력해주세요.(금액): ");
        String moneyStr = sc.next();
        if (moneyStr.indexOf("원") > -1) {
            moneyStr = moneyStr.substring(0, moneyStr.indexOf("원"));
                }
        int money = Integer.parseInt(moneyStr);
        int cash = (int) (Math.floor((money * 0.1) / 100)) * 100; // 백원 단위로 만들기
        if (cash > 300) {
            cash = 300; // 캐시백 포인트가 300을 넘을 경우 300으로 고정
        }
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원입니다.", money, cash);
        }
    }