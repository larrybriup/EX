��֪��MyPoint��ʾһ����ά�ĵ㣬�䶨�����£�
public class MyPoint {
  public int x;
  public int y;

  public String toString() {
    return ("[" + x + "," + y + "]");
  }
}

ʹ���������ṩ��MyPoint�࣬����һ��TestMyPoint���򣬸ó���ִ�����в�����
1��������������ΪMyPoint�ı�����������Ϊ��start �� end��ÿ��������ֵһ���µ�MyPoint�Ķ���
2����start �� x �� y ֵ����Ϊ10��end�� xֵ����Ϊ20��yֵΪ30��
3����ӡ��������������ʹ�����������µĴ��룺System.out.println(��Start point is ��+start);
4����������TestMyPoint��
5������һ������ΪMyPoint���±�������Ϊstray �����б���end ������ֵ��ֵ��stray��
6����ӡ���stray �� end ��
7������ֵ��ֵ��stray ������ x �� y��Ա����ӡ���stray end start��
8����������TestMyPoint��end�����ֵ��ӳ��stray�еı仯��˵���������������õ���ͬһ��MyPoint���󡣵��ǣ�start��û�иı䣬˵��start�������������޹ء�

������Ӧ���������ƣ�
Start point is ��10��10��
End point is ��20��30��
  
Stray point is ��20��30��
End point is ��20��30��
 
Stray point is ��47��50��	
End point is ��47��50��
Start point is ��10��10��
