package corejava.ch03.ex;

public class Digit{
	public static void main(String[] args){
		int num = 0,count = 0;
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				for(int k=1;k<=4;k++){
					if(i!=j&&j!=k&&k!=i){
							num = i*100+j*10+k;
							count++;
							if(count%5==0)
								System.out.println();
							System.out.print(num+"\t");
					}
				}
			}
		}
		System.out.println();
		System.out.println("count = "+count);
	}
}