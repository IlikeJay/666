package cn.nightPractice;

import java.util.HashSet;
import java.util.Random;

public class OldDriver5_1 {

	/**
	 * 1.�������10���������ڼ����У�Ҫ�����ظ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random();
		HashSet<Integer> hs =new HashSet<>();
		while (true) {
			int num =r.nextInt(100);
			if (!hs.contains(num)) {
				hs.add(num);
				if (hs.size()==10) {
					break;
				}
			}
		}
		System.out.println(hs);
	}

}
