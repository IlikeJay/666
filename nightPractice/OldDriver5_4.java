package cn.nightPractice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OldDriver5_4 {
	 static List<File> list =new ArrayList<>();
	 static int count =0;
	/**
	 * 4.��дһ����������ѯ�ļ�����ָ����չ���ļ��ĸ�����12�֣� �������������û������·���Լ�ָ������չ������÷����У�
	 * ���ظ�Ŀ¼�����з��ϸ���չ���ļ��ĸ��� ���磺����D:\\aaa ���ļ���չ��Ϊ .jpg ��ô��Ҫͳ���� D:\\aaa
	 * ��������չ��Ϊ.jpg�ļ��ĸ��������ļ����з����������ļ�ҲҪͳ�ƽ�ȥ��
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
			return -1;//����-1˵��Ŀ¼Ϊ��
		}
//		����һ��������ͳ�����������ĸ���
//		int count=0;//���� ,ע��:��Ϊÿ�εݹ� �����ʼ��count   ���԰�count ����Ϊ�����
		//��Ϊ����һ������,ͨ�����ϵ�size()��ͳ��  �����ַ���������
		
		for (File file : files) {
			if (file.isFile()) {
				
				if (file.getName().toLowerCase().endsWith(extension)) {
					count++;
//					list.add(file);
//	��֤��				System.out.println(file);
				}
			}else {//file�����ļ�����Ŀ¼,�ݹ�
				inquire(file.getAbsolutePath(),extension);
			}
		}
//		return list.size();
		return count;
	
		
	}

}
