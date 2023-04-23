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
        System.out.print("���� �������� �̸��� �Է��ϼ���: ");
        this.name = sc.nextLine();
        weapon = new MyWeapon();
        weapon.charge(unitPower);
    }

    // ���� �޼���
    public void attack(int power) {
        // ���� �Ŀ����� ���� �Ŀ��� ũ�� ����
        if (power > weapon.getRestPower()) {
            System.out.println("���� ����!");
            return;
        }

        // ���� ���� ���� ���� ����
        boolean isSuccess = weapon.Success();
        if (isSuccess) {
            bossPower -= power;
            System.out.println(name + "�� ���� ����! ������ ü��: " + bossPower);
        } else {
            // �Ŀ� ���� ���� ���� ����
            boolean isChargeSuccess = weapon.chargeSuccess();
            if (isChargeSuccess) {
                unitPower += 100;
                System.out.println(name + "�� ���� ����! �Ŀ� 100 ����! ���� �Ŀ�: " + unitPower);
            } else {
                System.out.println(name + "�� ���� ����! �Ŀ� ��ȭ ����!");
            }
        }
        weapon.fire(power);
    }

    public static void main(String[] args) {
        GameUnit unit = new GameUnit();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("f�� ���� �����ϼ���: "); // ���� �޽��� ����
            String input = sc.next();
            
            // "f"�� �Է��ϸ� ������ �Ŀ��� ���� ����
            if (input.equals("f")) {
                int power = 200; // ������ �Ŀ��� ����
                unit.attack(power);
            } else {
                System.out.println("�߸��� �Է��Դϴ�.");
            }

            // ������ ������ ü���� 0 ���ϸ� ���� ����
            if (bossPower <= 0) {
                System.out.println(unit.name + "�� �¸�!");
                break;
            }

            if (unit.unitPower <= 0) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
