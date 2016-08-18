package cn.nightPractice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OldDriver5_4 {
	 static List<File> list =new ArrayList<>();
	 static int count =0;
	/**
	 * 4.编写一个方法：查询文件夹内指定扩展名文件的个数（12分） 方法描述：将用户输入的路径以及指定的扩展名传入该方法中，
	 * 返回该目录下所有符合该扩展名文件的个数 比如：输入D:\\aaa ，文件扩展名为 .jpg 那么需要统计在 D:\\aaa
	 * 中所有扩展名为.jpg文件的个数（子文件夹中符合条件的文件也要统计进去）
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =inquire("F:\\888",".txt");
		System.out.println(n);
	}
	
	public static int inquire(String pathName,String extension) {
		File f=new File(pathName);
		File[] files = f.listFiles();
		if (files==null) {
			return -1;//返回-1说明目录为空
		}
//		定义一个变量来统计满足条件的个数
//		int count=0;//不行 ,注意:因为每次递归 都会初始化count   可以把count 定义为类变量
		//改为定义一个集合,通过集合的size()来统计  这两种方法都可以
		
		for (File file : files) {
			if (file.isFile()) {
				
				if (file.getName().toLowerCase().endsWith(extension)) {
					count++;
//					list.add(file);
//	验证下				System.out.println(file);
				}
			}else {//file不是文件就是目录,递归
				inquire(file.getAbsolutePath(),extension);
			}
		}
//		return list.size();
		return count;
	
		
	}

}
