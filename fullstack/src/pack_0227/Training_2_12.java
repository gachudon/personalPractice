package pack_0227;

import java.util.Scanner;

public class Training_2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sArray;
		Scanner scan = new Scanner(System.in);
		int key = 0;
		int index =0;
		
		System.out.println("데이터를 오름차순으로 입력하시오>>");
		sArray = scan.nextLine().split(" ");
		
		int[] iArray = new int[sArray.length];
		for(int i=0;i<iArray.length;i++) {
			iArray[i] = Integer.parseInt(sArray[i]);
			System.out.printf("iArray[%d]=%d\n", i,iArray[i]);
		}
		
		System.out.print("검색할 값을 입력하세요 >> ");
		key = Integer.parseInt(scan.nextLine());
		
		index = binSearch(iArray,key);
		if(index <0) System.out.printf("%d는 배열에 존재하지 않음\n",key);
		else System.out.printf("%d는 인덱스 %d에 위치함\n", key,index);
		scan.close();
		
	}
	
	public static int binSearch(int[] iArray, int key) {
		int lIndex = 0;
		int rIndex = iArray.length-1;
		do {
			int cIndex = (lIndex+rIndex)/2;
			if(iArray[cIndex]==key)
				return cIndex;
			else if(iArray[cIndex]<key)
				lIndex = cIndex+1;
			else
				rIndex=cIndex-1;
		}while(lIndex<=rIndex);
		return -1;
	}
}
