package corejava.ch08.ex.e3;

public class Calcu {

	private String[] fu;
	private double[] num;
	private int count = 0;

	public Calcu(String[] fu, double[] nu) {
		this.fu = fu;
		this.num = nu;
	}

	public String doCal() {
		coun("*");
		coun("/");
		coun("+");
		coun("—");
		return num[0] + "";
	}

	public int getIndex(String x) {
		for (int i = 0; i < fu.length - count; i++) {
			if (fu[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}

	public void coun(String x) {
		int index;
		while ((index = getIndex(x)) != -1) {
			if (x.equals("+")) {
				// System.out.println(num[index]+" + "+ num[index + 1]
				// +"="+(num[index] + num[index + 1]));
				num[index] = num[index] + num[index + 1];
				numMove(index);
				count++;
			}
			if (x.equals("—")) {
				// System.out.println(num[index]+" - "+ num[index + 1]
				// +"="+(num[index] - num[index + 1]));
				num[index] = num[index] - num[index + 1];
				numMove(index);
				count++;
			}
			if (x.equals("*")) {
				// System.out.println(num[index]+" * "+ num[index + 1]
				// +"="+(num[index] * num[index + 1]));
				num[index] = num[index] * num[index + 1];
				numMove(index);
				count++;
			}
			if (x.equals("/")) {
				// System.out.println(num[index]+" / "+ num[index + 1]
				// +"="+(num[index] / num[index + 1]));
				num[index] = num[index] / num[index + 1];
				numMove(index);
				count++;
			}
		}
	}

	private void numMove(int index) {
		for (int i = index; i < num.length - count - 1; i++) {
			if (i + 1 == num.length - count - 1) {
				fu[i] = null;
				return;
			} else {
				num[i + 1] = num[i + 2];
				fu[i] = fu[i + 1];
			}
		}
	}

	public static void main(String[] args) {
		String[] s = new String[] { "+", "—", "*" };
		double[] num = new double[] { 1, 2, 3, 4 };
		Calcu c = new Calcu(s, num);
		System.out.println(c.doCal());
	}

}
