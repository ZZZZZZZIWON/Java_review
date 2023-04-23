package Game;

import java.util.Random;
import java.util.Scanner;

public class GameUnit {
    static int bossPower = 10000;
    private int unitPower = 1000;
    private MyWeapon weapon;
    private String name;

    public GameUnit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("게임 참가자의 이름을 입력하세요: ");
        this.name = sc.nextLine();
        weapon = new MyWeapon();
        weapon.charge(unitPower);
    }

    // 공격 메서드
    public void attack(int power) {
        // 현재 파워보다 공격 파워가 크면 실패
        if (power > weapon.getRestPower()) {
            System.out.println("공격 실패!");
            return;
        }

        // 공격 성공 여부 랜덤 결정
        boolean isSuccess = weapon.Success();
        if (isSuccess) {
            bossPower -= power;
            System.out.println(name + "의 공격 성공! 보스의 체력: " + bossPower);
        } else {
            // 파워 증가 여부 랜덤 결정
            boolean isChargeSuccess = weapon.chargeSuccess();
            if (isChargeSuccess) {
                unitPower += 100;
                System.out.println(name + "의 공격 실패! 파워 100 증가! 현재 파워: " + unitPower);
            } else {
                System.out.println(name + "의 공격 실패! 파워 변화 없음!");
            }
        }
        weapon.fire(power);
    }

    public static void main(String[] args) {
        GameUnit unit = new GameUnit();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("f를 눌러 공격하세요: "); // 공격 메시지 수정
            String input = sc.next();
            
            // "f"를 입력하면 일정한 파워로 공격 실행
            if (input.equals("f")) {
                int power = 200; // 일정한 파워로 변경
                unit.attack(power);
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            // 보스나 유닛의 체력이 0 이하면 게임 종료
            if (bossPower <= 0) {
                System.out.println(unit.name + "의 승리!");
                break;
            }

            if (unit.unitPower <= 0) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
