package pack_0213;

import java.lang.Math;

public class VoteCounting extends Thread{
	private int index;
	
	public VoteCounting(int index) {
		this.index = index;
	}
	@Override
	public void run() {
		int votingRate = 0;
		int increaseRate = (int)(Math.random()*(5-1)+1);
		
		while(votingRate <= 100) {
			try {
				Thread.sleep(700);
			} catch(InterruptedException e) {return;}
			System.out.printf("제%d지역구 개표율 : %d 개표증가율 : %d ",index,votingRate,increaseRate);
			for(int i=0;i<votingRate;i++)
				System.out.print("*");
			System.out.println();
			votingRate+=increaseRate;
		}
	}
}
