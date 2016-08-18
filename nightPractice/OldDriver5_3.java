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
	 * 3.思考题： 已知一个String数组[衣服，零食，化妆品，鞋]随机生成6个10以内的整数然后将这六个数字拼接成一个字符串做为取货码，（）
	 * 共生成4个取货码（4个取货码互不相同）将这4个取货码分别和该数组里面的元素依次进行组合，
	 * 组合格式：（取货码-物品）并存入Map集合(Map<取货码,物品>)中，根据用户输入的取货码将对应的物品打印到控制台上，
	 * 如果取货码错误(不存在)则提示“对不起！取货码有误”（10分）
	 */
	public static void main(String[] args) {
		// 分析
		//先定义一个String数组
		String[] strs ={"衣服","零食","化妆品","鞋"};
		//随机生成6个10以内的整数
			//先生成10以内的整数(0-9)//再找个集合装
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
		//拼接成字符串当取货码用 
		String s =new String();
		for (Integer integer : list) {
			s+=s.valueOf(integer);
			
		}
		
		set.add(s);
		if (set.size()==4) {
			break;
		}
		
		}
		System.out.println(set);//验证set是不是装了四个取货码了
		//创建Map集合 put ,将这4个取货码分别和该数组里面的元素依次进行组合，
		Map<String,String> map =new HashMap<>();
		Object[]obj =set.toArray();
		map.put(((String)obj[0]), strs[0]);
		map.put(((String)obj[1]), strs[1]);
		map.put(((String)obj[2]), strs[2]);
		map.put(((String)obj[3]), strs[3]);
		//根据用户输入的取货码将对应的物品打印到控制台上， 如果取货码错误(不存在)则提示“对不起！取货码有误”
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入取货码");
		String input =sc.nextLine();
		if (!map.keySet().contains(input)) {
			System.out.println("对不起！取货码有误");
			
		}else {
			System.out.println(map.get(input));
		}
		
		
		
	}
}
