package corejava.ch04.ex.e2;

//选择排序
public class Selection {

	public static void main(String[] args) {

		int a[] = { 2, 6, 9, 3, 45, 67, 23, 45, 56, 0 };

		for (int i = 0; i < a.length - 1; i++) {// 外层循环,到倒数第二个
			// 最小的数字的索引,刚开始的时候是每次循环的第一个
			int p = i;
			// 找出最小的数
			for (int j = i + 1; j < a.length; j++) {

				// 如果有比循环开始的数小的数,则把其索引给p,p不再指向i,
				// 而是指向比i小的第一数,然后用这个数和后面的数比较
				if (a[p] > a[j]) {
					p = j;
				}
			}
			// 把每次循环值找出的最小的数和循环的开始数字交换
			int temp;
			temp = a[i];
			a[i] = a[p];
			a[p] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		/*
		 * int min = a[0]; int j = 0; int k; int i; for(k=0;k<a.length;k++){
		 * for(i=0;i<a.length-2;i++){ if(a[i]>a[i+1]){ min = a[i+1]; j = i+1;
		 * }else{
		 * 
		 * min = a[i]; j = i; }
		 * 
		 * 
		 * } int temp; temp = a[j]; a[j] = a[k]; a[k] = temp;
		 * 
		 * System.out.print(a[i+1]+" "); }
		 */

	}

}
