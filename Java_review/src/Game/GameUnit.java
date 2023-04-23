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
        System.out.print("���� �������� �̸��� �Է��ϼ���: ");
        this.name = scan.nextLine();
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
        Random rand = new Random();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("�ɼ��� �����ϼ��� (f: ����, i: ������): ");
            String input = sc.next();
            
            // "f"�� �Է��ϸ� ������ �Ŀ��� ���� ����
            if (input.equals("f")) {
                int power = 200; // ������ �Ŀ��� ����
                unit.attack(power);
            } 
            // "i"�� �Է��ϸ� Į�� ���� ���� (2���� 1 Ȯ���� charge �߻�)
            else if (input.equals("i")) {
                int power = 100;
                boolean chargeSuccess = rand.nextBoolean();
                if (chargeSuccess) {
                    unit.weapon.charge(power);
                    System.out.println("������ �Ŀ� " + power + " ����! ���� �Ŀ�: " + unit.weapon.getRestPower());
                } else {
                    return;
                }
            } else {
                System.out.println("�߸��� �Է��Դϴ�.");
            }

            // ������ ������ ü���� 0 ���ϸ� ���� ����
            if (bossPower <= 0) {
                System.out.println(unit.name + " �¸�!");
                break;
            } else if (unit.unitPower <= 0) {
                System.out.println("���� ����! ���� �¸�!");
                break;
            }
        }
    }
}
