/**
 * 
 */
package cn.wsyjlly;

/**
 * @Author     	晏沈威
 * @Email	   	wsyjlly@qq.com
 * @Type_name  	TestBankerClass
 * @Createtime 	2018年10月16日 下午12:39:25
 */
import java.util.Scanner;

public class TestBankerClass {
	public static void main(String[] args) { // TODO code application logic here
		boolean Choose = true;
		String C;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		BankerClass T = new BankerClass();
		System.out.println("这是一个三个进程，初始系统可用三类资源为{10,8,7}的银行家算法：");
		T.setSystemVariable();
		while (Choose == true) {
			T.setRequest();
			System.out.println("您是否还要进行请求：y/n?");
			C = in.nextLine();
			if (C.endsWith("n")) {
				Choose = false;
			}
		}
	}

}
