package corejava.ch04.ex.e2;
//插入排序
public class Insertion {
	
	public static void main(String[] args) {
		int a[] = {2,6,9,3,45,67,23,45,56,0};
		System.out.println("排序前的数组:");
		for(Integer i:a){
			System.out.print(i+"  ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++){//遍历整个数组
			int insertVal = a[i];//把要插入的数字赋给变量insertVal
			int insertIndex = i-1;//要插入的地方的索引,是当前数字的前面
			//当索引大于负数的时候,要插入的值和索引所在的值相比较,如果小与他,则索引所在的
			//数字后移以为,insertIndex--,依次从后往前和前面的数比较
			while(insertIndex>=0 && insertVal<a[insertIndex]){
				a[insertIndex+1] = a[insertIndex];
				insertIndex--;
			}
			//如果不是小与他,则把要插入的值赋给前面的数的后面
			a[insertIndex+1] = insertVal;
		}
		System.out.println("排序后的数组为：");
		for(int i=0;i<a.length;i++){
      		System.out.print(a[i]+"  ");
		}
		System.out.println ();
	}
}
