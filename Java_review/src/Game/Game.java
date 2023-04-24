package Game;

import java.util.Scanner;

interface Weapon {
	void attack(); // �����ؼ� ������ power�� ���ҽ�Ŵ
}

abstract class MyItem implements Weapon {
	abstract void recover(); // Gun�� �������� �� ���� �� �ִ� ȸ���޼ҵ�
}

class Gun extends MyItem {
	int power = 500; // ���ݷ� 500

	@Override
	public void attack() {
		if (Math.random() < 0.5) { // 50%�� Ȯ���� ������ ���
			Boss.defend();
			
			return;
		}
		System.out.println("���� ����!");
		Boss.setPower(Boss.getPower() - power); 
		System.out.println("[������ ü���� " + power + "��ŭ �����߽��ϴ�!]");
		System.out.println("������ ü��: " + Boss.getPower());
		System.out.println(Character.getName() + "�� ü��: " + Character.getPower());
		
	}

	@Override
	void recover() { // ȸ�� method
 		if (Math.random() < 0.5) {    
			System.out.println("ȸ�� ����!");
			return;
		}
 		System.out.println("ȸ�� ����!");
		Character.setPower(Character.getPower() + 100);
		System.out.println("[ü���� 100 �����߽��ϴ�!]");
		System.out.println(Character.getName() + "�� ü��: " + Character.getPower());
	}
}

class Boss {
	private static int power = 5000; // ������ power

	public static int getPower() {
		return power;
	}

	public static void setPower(int power) {
		Boss.power = power;
	}

	public static void defend() { // ������ ��� �޼ҵ�
	    if (Math.random() < 0.5) {
	    	Character.setPower(Character.getPower() - 200);
	        System.out.println("������ ��� ����!");
	        System.out.println("[ĳ������ ü���� 200 �����߽��ϴ�!]");
	        System.out.println("������ ü��: " + Boss.getPower());
			System.out.println(Character.getName() + "�� ü��: " + Character.getPower());
	        
	    } else {
	        Boss.setPower(Boss.getPower() - 500);
	        System.out.println("������ ��� ����!");
	        System.out.println("������ ü��: " + Boss.getPower());
	        System.out.println(Character.getName() + "�� ü��: " + Character.getPower());
	    }
	}
}

class Character {
	private static int power = 1000; // ����ĳ������ power
	private static String name;

	public static int getPower() {
		return power;
	}

	public static void setPower(int power) {
		Character.power = power;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Character.name = name;
	}

	MyItem item; // ���� ����

	Character(String name, MyItem item) {
		setName(name);
		this.item = item;
	}

	void attack() {
		item.attack();
	}

	void recover() {
		item.recover();
	}
}

public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("ĳ������ �̸��� �Է��ϼ���: ");
		String name = scan.nextLine();

		MyItem item =  new Gun();
		
		Character player = new Character(name, item);
		System.out.println("ĳ���� " + player.getName() + "��/�� �����Ǿ����ϴ�.");

		Boss boss = new Boss();
		System.out.println("������ ü��: " + boss.getPower());
		System.out.println(name + "�� ü��: " + player.getPower());

		// ���� ����
		while (true) {
			System.out.println("����(g) �Ǵ� ȸ��(r)�� �����ϼ���.");
			String choice = scan.nextLine();

			if (choice.equals("g")) {
				player.attack();
			} else if (choice.equals("r")) {
				player.recover();
			} else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}

			if (Boss.getPower() <= 0) {
				System.out.println("You Win!");
				break; // ���� ����
			} else if (Character.getPower() <= 0) {
				System.out.println("-----Game Over-----");
				break; // ���� ����
			}
		}
	}
}
