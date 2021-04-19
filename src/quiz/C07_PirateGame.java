package quiz;

import java.util.Scanner;

import long.myobj.Barrel;

public class C07_PirateGame {

		// 1 플레이어가 돌아가면서 원하는 곳에 칼으 ㄹ찌른다
		//2 잘못된 곳에 칼을 넣으면 해적이 날아가며 게임에 패배한다
	
	Scanner sc;
	
	Barrel barrel;
	int mode;
	
	int turn;
	int numOfPlayer;
	
	
	public C07_PirateGame(int mode) {
		this.barrel = new Barrel(10);
		this.mode = mode;
		this.turn = 0;
		this.numOfPlayer = 2;
	}
	
	public C07_PirateGame(int mode, int numOfplayer) {
		this.barrel = new Barrel(20);
		this.mode = mode;
		this.turn = 0;
		this.numOfPlayer = 2;
		this.sc = new Scanner(System.in);
		
		
	public C07_PirateGame(int mode, int numOfPlayer) {
		this.barrel = new Barrel(10);
		this.mode = mode;
		this.numOfPlayer = numOfplayer;
		
	}
	}
	
	public void start() {
		switch (this.mode) {
		case 0:
			break;
			pvp();
		case 1:
			break;
			pvc;
		default:
			System.out.println("아직");
			break;
		}
	}
	
	public void config(int mode) {
		this.mode = mode;
	}
	
	void pvp() {
		while (true) {
			System.out.println(turn + "턴 >");
			System.out.print("Player" +(turn % numOfPlayer +1) + "의 차례>");
			int slot = sc.nextInt();
			
			boolean fork_
			
			if(barrel.fork(slot));{
				turn++;
			}
		
			turn++;
		}
	}
	
	void pvc() {
		
	}
	public static void main(String[] args) {
		C07_PriateGame testGame = new C07_PirateGame(99,3);
		
		
		testGame.start();
		testGame.config(0);
		testGame.start();
		
		System.out.println("테스트 게임 끝!");
		}
	}


