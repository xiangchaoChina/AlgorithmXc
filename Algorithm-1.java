package com.lgd.Ti;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Tt1 {
	public static void main(String[] args) throws ParseException {
		/**
		 * 问题：有一对兔子， 从出生后第3个月起每个月都生一对兔子， 小兔子长到第三个月后每个月又生一对兔子，
		 * 假如兔子都不死，问每个月的兔子对数为多少？ 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
		 * */

		Scanner input = new Scanner(System.in);
		/**
		 * int mon = input.nextInt(); int one = 1; int two = 1; int now = 0; for
		 * (int i = 3; i <= mon; i++) { //当前月为前两个月之和 now = one + two; one = two;
		 * two = now; } System.out.println(now);
		 */
		/**
		 * 题目：打印出所有的"水仙花数"， 所谓"水仙花数"是指一个三位数， 其各位数字立方和等于该数本身。 例如：153是一个"水仙花数"，
		 * 因为153=1的三次方＋5的三次方＋3的三次方。
		 * 
		 * int b = 0; int s = 0; int g = 0; for (int i = 100; i <= 999; i++) {
		 * b=i/100;//获取百位 s=i/10%10;//获取十位 g=i%10;//获取各位
		 * if((b*b*b+s*s*s+g*g*g)==i){ System.out.println("水仙花数:"+i); } }
		 */
		/**
		 * 一球从100米高度自由落下， 每次落地后反跳回原高度的一半；再落下， 求它在 第10次落地时，共经过多少米？第10次反弹多高？
		 * double star = 100.00;//初始高度 double sum = 0.00;//总高度 for (int i = 1; i
		 * <= 10; i++) { sum+=star*3/2;//经历的路程 star = star/2;//当前反弹的高度,下一次落下的高度
		 * System.out.println(i+"次:经历的总路程"+sum+"米,反弹的高度:"+star); }
		 */
		/**
		 * 一个整数，它加上100后是一个完全平方数， 再加上168又是一个完全平方数，请问该数是多少
		 * 程序分析：在10万以内判断，先将该数加上100后再开方， 再将该数加上168后再开方，如果开方后的结 果满足完全平方数
		 */
		/***
		 * [2,6,4,8]
		 */
		// 需要遍历的数组
		/*
		 * int[] array = { 2, 6, 4, 8 }; int count = 0; long star =
		 * System.currentTimeMillis(); for (int i = 0; i < array.length; i++) {
		 * for (int j = 0; j < array.length; j++) { for (int k = 0; k <
		 * array.length; k++) { if(i!=j&&j!=k&&i!=k){ int one = array[i]; int
		 * two = array[j]; int three = array[k]; int four = array[6-(i+j+k)];
		 * count++; System.out.println(one+""+two+""+three+""+four); } } } }
		 * System.out.println("共有:"+count);
		 * System.out.println("历时:"+(System.currentTimeMillis()-star));
		 */
		/**
		 * 闰年:能被4整除能被400整除,不能被100整除 输入某年某月某日，判断这一天是这一年的第几天？
		 * 程序分析：以3月5日为例，应该先把前两个月的加起来， 然后再加上5天即本年的第几天，特殊情况， 闰年且输入月份大于3时需考虑多加一天。
		 */
		/*
		 * System.out.println("请输入年份:"); String dateStr = input.next(); String
		 * dateStr2 = input.next();
		 *//**
		 * 第一步: 通过SimpleDateFormat类, parse();字符串转换为Date
		 */
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 * Date date = sdf.parse(dateStr + " " + dateStr2);
		 *//**
		 * 第二步: 创建Calendar类,讲Date类型转换为Calendar setTimeInMillis(long millis);
		 */
		/*
		 * Calendar calendar = Calendar.getInstance();
		 * calendar.setTimeInMillis(date.getTime());
		 *//**
		 * 最后一步: get(常量);获取当前日期在本年是第几天
		 */
		/*
		 * calendar.get(Calendar.DAY_OF_YEAR);
		 */
		/*
		 * setTimeInMillis(long millis) 用给定的 long 值设置此 Calendar 的当前时间值。
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		Tt1 t = new Tt1();
		t.getNumberCount(list, 4, 0);
	}

	public int count = 0;// 计数器

	/**
	 * @param numList
	 *            需要遍历的集合
	 * @param median
	 *            想要的位数(例如:四位,五位)
	 * @param currNum
	 * 
	 */
	public void getNumCount(List<Integer> numList, int median, int currNum) {
		if (median == 1) {
			for (int i = 0; i < numList.size(); i++) {
				int result = currNum + numList.get(i);
				count++;
				System.out.println("第" + count + "个数为：" + result);
			}
		} else {
			for (int i = 0; i < numList.size(); i++) {
				int medianNum = numList.get(i);
				int result = (int) (currNum + medianNum
						* Math.pow(10, median - 1));
				// 传入list的一个拷贝（直接传入上级的list，会出现每个层级剩下的数据错误）
				List list = new ArrayList();
				for (Integer num : numList) {
					int copyNum = num;
					if (copyNum != medianNum) {
						list.add(copyNum);
					}
				}
				getNumCount(list, median - 1, result);
			}
		}
	}
     
	public void getNumberCount(List<Integer> list, int decimal, int value) {
		if (decimal == 1) {
			for (int i = 0; i < list.size(); i++) {
				int result = value +list.get(i);
				count++;
				System.out.println("第"+count+"个:"+result);
			}
		}else{
			for (int i = 0; i < list.size(); i++) {
				int nowNum = list.get(i);
				int result = (int) (value+nowNum*Math.pow(10, decimal-1));
				List<Integer> copyList = new ArrayList<Integer>();
				for (Integer cpNum : list) {
					if(nowNum!=cpNum){
						copyList.add(cpNum);
					}
				}
				//递归
				getNumberCount(copyList,decimal-1,result);
			}
		}

	}
}
