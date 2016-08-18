package cn.nightPractice;

public class OldDriver5_2 {

	/**
	 * 
	 *	2."heLLo wOrLd"将此字符串变成"Hello World"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//分析需求:把单词首字母变大写  其他部分小写
		String s ="heLLo wOrLd";
		String[] strs =s.split(" ");//分割成两个单词
		for (String str : strs) {
			String s1 =str.substring(0,1).toUpperCase().concat(str.substring(1,str.length()).toLowerCase());
			System.out.print(s1+" ");
		}
		
	}

}
