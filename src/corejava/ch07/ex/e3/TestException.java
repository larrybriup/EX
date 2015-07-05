package corejava.ch07.ex.e3;

public class TestException

{
	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];
		
		try {
			Integer.parseInt(str1);
			Integer.parseInt(str2);
			Integer.parseInt(str3);
			System.out.println("输入：" + str1 + " " + str2 + " " + str3);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please input three int type number!");
		}
		System.out.println("end method main");
	}
}
