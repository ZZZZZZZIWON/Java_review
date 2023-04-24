package Game;

import java.util.Scanner;

interface Weapon {
	void attack(); // 공격해서 보스의 power를 감소시킴
}

abstract class MyItem implements Weapon {
	abstract void recover(); // Gun을 생성했을 때 가질 수 있는 회복메소드
}

class Gun extends MyItem {
	int power = 500; // 공격력 500

	@Override
	public void attack() {
		if (Math.random() < 0.5) { // 50%의 확률로 보스의 방어
			Boss.defend();
			
			return;
		}
		System.out.println("공격 성공!");
		Boss.setPower(Boss.getPower() - power); 
		System.out.println("[보스의 체력이 " + power + "만큼 감소했습니다!]");
		System.out.println("보스의 체력: " + Boss.getPower());
		System.out.println(Character.getName() + "의 체력: " + Character.getPower());
		
	}

	@Override
	void recover() { // 회복 method
 		if (Math.random() < 0.5) {    
			System.out.println("회복 실패!");
			return;
		}
 		System.out.println("회복 성공!");
		Character.setPower(Character.getPower() + 100);
		System.out.println("[체력이 100 증가했습니다!]");
		System.out.println(Character.getName() + "의 체력: " + Character.getPower());
	}
}

class Boss {
	private static int power = 5000; // 보스의 power

	public static int getPower() {
		return power;
	}

	public static void setPower(int power) {
		Boss.power = power;
	}

	public static void defend() { // 보스의 방어 메소드
	    if (Math.random() < 0.5) {
	    	Character.setPower(Character.getPower() - 200);
	        System.out.println("보스의 방어 성공!");
	        System.out.println("[캐릭터의 체력이 200 감소했습니다!]");
	        System.out.println("보스의 체력: " + Boss.getPower());
			System.out.println(Character.getName() + "의 체력: " + Character.getPower());
	        
	    } else {
	        Boss.setPower(Boss.getPower() - 500);
	        System.out.println("보스의 방어 실패!");
	        System.out.println("보스의 체력: " + Boss.getPower());
	        System.out.println(Character.getName() + "의 체력: " + Character.getPower());
	    }
	}
}

class Character {
	private static int power = 1000; // 게임캐릭터의 power
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

	MyItem item; // 무기 생성

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

		System.out.print("캐릭터의 이름을 입력하세요: ");
		String name = scan.nextLine();

		MyItem item =  new Gun();
		
		Character player = new Character(name, item);
		System.out.println("캐릭터 " + player.getName() + "이/가 생성되었습니다.");

		Boss boss = new Boss();
		System.out.println("보스의 체력: " + boss.getPower());
		System.out.println(name + "의 체력: " + player.getPower());

		// 게임 시작
		while (true) {
			System.out.println("공격(g) 또는 회복(r)을 선택하세요.");
			String choice = scan.nextLine();

			if (choice.equals("g")) {
				player.attack();
			} else if (choice.equals("r")) {
				player.recover();
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}

			if (Boss.getPower() <= 0) {
				System.out.println("You Win!");
				break; // 게임 종료
			} else if (Character.getPower() <= 0) {
				System.out.println("-----Game Over-----");
				break; // 게임 종료
			}
		}
	}
}
