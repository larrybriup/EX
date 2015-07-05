package corejava.ch04.ex.e2;

public class Bubble{//冒泡排序
	public static void main(String[] args){
		int[] arr = {2,5,-5,98,198,43};
		      
		System.out.println("排序前的数组:");
		for(int i=0;i<arr.length;i++){
      		System.out.print(arr[i]+"  ");
		}
		System.out.println ();
      
		//外层循环从第一个到倒数第二个,依次和这个数的以后的数字比较,
		//如果小与后者,则互换,把最大的数跳到前面,最后排序完成,前大后小
		//内层循环控制和遍历数组的循环比较的数字
		int tmp=0;
		for(int i=0;i<arr.length-1;i++){
      		for(int j=i;j<arr.length;j++){
      			if(arr[i]<arr[j]){
      				tmp=arr[j];
      				arr[j]=arr[i];
      				arr[i]=tmp;
      			}      		
      		}
		}
           	
		System.out.println ("排序后的数组:");
		for(int i=0;i<arr.length;i++){
      		System.out.print(arr[i]+"  ");      
		}     
	}
}