package Game;

import java.util.Random;
import java.util.Scanner;

public class GameUnit {
    static int bossPower = 5000;
    private int unitPower = 500;
    private MyWeapon weapon;
    private String name;

    public GameUnit() {
        Scanner scan = new Scanner(System.in);
        System.out.print("게임 참가자의 이름을 입력하세요: ");
        this.name = scan.nextLine();
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
        Random rand = new Random();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("옵션을 선택하세요 (f: 공격, i: 아이템): ");
            String input = sc.next();
            
            // "f"를 입력하면 일정한 파워로 공격 실행
            if (input.equals("f")) {
                int power = 200; // 일정한 파워로 변경
                unit.attack(power);
            } 
            // "i"를 입력하면 칼로 공격 실행 (2분의 1 확률로 charge 발생)
            else if (input.equals("i")) {
                int power = 100;
                boolean chargeSuccess = rand.nextBoolean();
                if (chargeSuccess) {
                    unit.weapon.charge(power);
                    System.out.println("아이템 파워 " + power + " 증가! 현재 파워: " + unit.weapon.getRestPower());
                } else {
                    return;
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            // 보스나 유닛의 체력이 0 이하면 게임 종료
            if (bossPower <= 0) {
                System.out.println(unit.name + " 승리!");
                break;
            } else if (unit.unitPower <= 0) {
                System.out.println("게임 오버! 보스 승리!");
                break;
            }
        }
    }
}
