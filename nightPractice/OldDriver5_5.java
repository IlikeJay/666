package cn.nightPractice;

public class OldDriver5_5 {

	/**
	 * 
	 *5."woaijavahaohaoxuejavayuexinguowanwoshijavachengxuyuan",
	 *������ַ����е�java����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="woaijavahaohaoxuejavayuexinguowanwoshijavachengxuyuan";
//		String s2 ="chengxuyuan";
//		System.out.println(s2.indexOf("java"));  ����Ҳ�������-1
//		char[] chars = s.toCharArray();
		
//		
//		int count=0;
//		for (int i = 0; i <chars.length-4; i++) {
//			if (s.substring(i, i+3).equals("java")) {
//				count++;
//			}
//		}
//		System.out.println(count);//ΪʲôcountһֱΪ0?
		//���ķ�����!
//		System.out.println(s.indexOf("java"));
//		System.out.println(s.substring(4));
		int count =0;
		while (s.length()>0) {
			int index =s.indexOf("java");
			s=s.substring(index+4);	
			count++;
			if (s.indexOf("java")==-1) {
				break;
			}
		}
		System.out.println(count);
		
	
		
		
	}

}
