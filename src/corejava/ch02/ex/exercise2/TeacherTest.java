package corejava.ch02.ex.exercise2;

public class TeacherTest 
{
	public static void main(String[] args) 
	{
		//��������
		Teacher t = new Teacher();
		
		//Ϊ��������Ը�ֵ
		t.name = "George";
		t.age = 30;
		t.salary = 10000;

		//������������
		System.out.println("name=" + t.name);
		System.out.println("age=" + t.age);
		System.out.println("salary=" + t.salary);

		//����ʹ�������ӵķ�����������Ӻ������
		t.increaseAge();
		System.out.println("new age=" + t.age);
	}
}
