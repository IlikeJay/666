package cn.nightPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class OldDriver5_3 {

	private static final String String = null;

	/**
	 * 3.˼���⣺ ��֪һ��String����[�·�����ʳ����ױƷ��Ь]�������6��10���ڵ�����Ȼ������������ƴ�ӳ�һ���ַ�����Ϊȡ���룬����
	 * ������4��ȡ���루4��ȡ���뻥����ͬ������4��ȡ����ֱ�͸����������Ԫ�����ν�����ϣ�
	 * ��ϸ�ʽ����ȡ����-��Ʒ��������Map����(Map<ȡ����,��Ʒ>)�У������û������ȡ���뽫��Ӧ����Ʒ��ӡ������̨�ϣ�
	 * ���ȡ�������(������)����ʾ���Բ���ȡ�������󡱣�10�֣�
	 */
	public static void main(String[] args) {
		// ����
		//�ȶ���һ��String����
		String[] strs ={"�·�","��ʳ","��ױƷ","Ь"};
		//�������6��10���ڵ�����
			//������10���ڵ�����(0-9)//���Ҹ�����װ
		Set<String> set =new HashSet<>();
		while (true) {
			
		
		Random r =new Random();
		List<Integer> list =new ArrayList<>();
		while (true) {
			int num =r.nextInt(10);
			if (!list.contains(num)) {
				list.add(num);
				if (list.size()==6) {
				break;
				}
			}
		}
		//ƴ�ӳ��ַ�����ȡ������ 
		String s =new String();
		for (Integer integer : list) {
			s+=s.valueOf(integer);
			
		}
		
		set.add(s);
		if (set.size()==4) {
			break;
		}
		
		}
		System.out.println(set);//��֤set�ǲ���װ���ĸ�ȡ������
		//����Map���� put ,����4��ȡ����ֱ�͸����������Ԫ�����ν�����ϣ�
		Map<String,String> map =new HashMap<>();
		Object[]obj =set.toArray();
		map.put(((String)obj[0]), strs[0]);
		map.put(((String)obj[1]), strs[1]);
		map.put(((String)obj[2]), strs[2]);
		map.put(((String)obj[3]), strs[3]);
		//�����û������ȡ���뽫��Ӧ����Ʒ��ӡ������̨�ϣ� ���ȡ�������(������)����ʾ���Բ���ȡ��������
		Scanner sc =new Scanner(System.in);
		System.out.println("������ȡ����");
		String input =sc.nextLine();
		if (!map.keySet().contains(input)) {
			System.out.println("�Բ���ȡ��������");
			
		}else {
			System.out.println(map.get(input));
		}
		
		
		
	}
}
