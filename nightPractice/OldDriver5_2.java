package cn.nightPractice;

public class OldDriver5_2 {

	/**
	 * 
	 *	2."heLLo wOrLd"�����ַ������"Hello World"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������:�ѵ�������ĸ���д  ��������Сд
		String s ="heLLo wOrLd";
		String[] strs =s.split(" ");//�ָ����������
		for (String str : strs) {
			String s1 =str.substring(0,1).toUpperCase().concat(str.substring(1,str.length()).toLowerCase());
			System.out.print(s1+" ");
		}
		
	}

}
