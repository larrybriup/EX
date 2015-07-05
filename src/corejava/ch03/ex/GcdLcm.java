package corejava.ch03.ex;

public class GcdLcm{
	public static void main(String[] args){
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int a=0;int b=0;int temp=0;
		if(num1<num2) /*�ҳ��������еĽϴ�ֵ*/
		{
			/*������������*/
			temp=num1;
			num1=num2;
			num2=temp; 
		}

		a=num1; b=num2;
		while(b!=0) /*����շת��������Լ��*/
		{
			temp=a%b;
			a=b;
			b=temp;
		}
		System.out.println(a);
	
	}
}
