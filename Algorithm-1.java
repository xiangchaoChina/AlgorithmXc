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
		 * ���⣺��һ�����ӣ� �ӳ������3������ÿ���¶���һ�����ӣ� С���ӳ����������º�ÿ��������һ�����ӣ�
		 * �������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣� ��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21....
		 * */

		Scanner input = new Scanner(System.in);
		/**
		 * int mon = input.nextInt(); int one = 1; int two = 1; int now = 0; for
		 * (int i = 3; i <= mon; i++) { //��ǰ��Ϊǰ������֮�� now = one + two; one = two;
		 * two = now; } System.out.println(now);
		 */
		/**
		 * ��Ŀ����ӡ�����е�"ˮ�ɻ���"�� ��ν"ˮ�ɻ���"��ָһ����λ���� ���λ���������͵��ڸ������� ���磺153��һ��"ˮ�ɻ���"��
		 * ��Ϊ153=1�����η���5�����η���3�����η���
		 * 
		 * int b = 0; int s = 0; int g = 0; for (int i = 100; i <= 999; i++) {
		 * b=i/100;//��ȡ��λ s=i/10%10;//��ȡʮλ g=i%10;//��ȡ��λ
		 * if((b*b*b+s*s*s+g*g*g)==i){ System.out.println("ˮ�ɻ���:"+i); } }
		 */
		/**
		 * һ���100�׸߶��������£� ÿ����غ�����ԭ�߶ȵ�һ�룻�����£� ������ ��10�����ʱ�������������ף���10�η�����ߣ�
		 * double star = 100.00;//��ʼ�߶� double sum = 0.00;//�ܸ߶� for (int i = 1; i
		 * <= 10; i++) { sum+=star*3/2;//������·�� star = star/2;//��ǰ�����ĸ߶�,��һ�����µĸ߶�
		 * System.out.println(i+"��:��������·��"+sum+"��,�����ĸ߶�:"+star); }
		 */
		/**
		 * һ��������������100����һ����ȫƽ������ �ټ���168����һ����ȫƽ���������ʸ����Ƕ���
		 * �����������10�������жϣ��Ƚ���������100���ٿ����� �ٽ���������168���ٿ��������������Ľ� ��������ȫƽ����
		 */
		/***
		 * [2,6,4,8]
		 */
		// ��Ҫ����������
		/*
		 * int[] array = { 2, 6, 4, 8 }; int count = 0; long star =
		 * System.currentTimeMillis(); for (int i = 0; i < array.length; i++) {
		 * for (int j = 0; j < array.length; j++) { for (int k = 0; k <
		 * array.length; k++) { if(i!=j&&j!=k&&i!=k){ int one = array[i]; int
		 * two = array[j]; int three = array[k]; int four = array[6-(i+j+k)];
		 * count++; System.out.println(one+""+two+""+three+""+four); } } } }
		 * System.out.println("����:"+count);
		 * System.out.println("��ʱ:"+(System.currentTimeMillis()-star));
		 */
		/**
		 * ����:�ܱ�4�����ܱ�400����,���ܱ�100���� ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
		 * �����������3��5��Ϊ����Ӧ���Ȱ�ǰ�����µļ������� Ȼ���ټ���5�켴����ĵڼ��죬��������� �����������·ݴ���3ʱ�迼�Ƕ��һ�졣
		 */
		/*
		 * System.out.println("���������:"); String dateStr = input.next(); String
		 * dateStr2 = input.next();
		 *//**
		 * ��һ��: ͨ��SimpleDateFormat��, parse();�ַ���ת��ΪDate
		 */
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 * Date date = sdf.parse(dateStr + " " + dateStr2);
		 *//**
		 * �ڶ���: ����Calendar��,��Date����ת��ΪCalendar setTimeInMillis(long millis);
		 */
		/*
		 * Calendar calendar = Calendar.getInstance();
		 * calendar.setTimeInMillis(date.getTime());
		 *//**
		 * ���һ��: get(����);��ȡ��ǰ�����ڱ����ǵڼ���
		 */
		/*
		 * calendar.get(Calendar.DAY_OF_YEAR);
		 */
		/*
		 * setTimeInMillis(long millis) �ø����� long ֵ���ô� Calendar �ĵ�ǰʱ��ֵ��
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		Tt1 t = new Tt1();
		t.getNumberCount(list, 4, 0);
	}

	public int count = 0;// ������

	/**
	 * @param numList
	 *            ��Ҫ�����ļ���
	 * @param median
	 *            ��Ҫ��λ��(����:��λ,��λ)
	 * @param currNum
	 * 
	 */
	public void getNumCount(List<Integer> numList, int median, int currNum) {
		if (median == 1) {
			for (int i = 0; i < numList.size(); i++) {
				int result = currNum + numList.get(i);
				count++;
				System.out.println("��" + count + "����Ϊ��" + result);
			}
		} else {
			for (int i = 0; i < numList.size(); i++) {
				int medianNum = numList.get(i);
				int result = (int) (currNum + medianNum
						* Math.pow(10, median - 1));
				// ����list��һ��������ֱ�Ӵ����ϼ���list�������ÿ���㼶ʣ�µ����ݴ���
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
				System.out.println("��"+count+"��:"+result);
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
				//�ݹ�
				getNumberCount(copyList,decimal-1,result);
			}
		}

	}
}
