package cn.OldDriver��ҵ2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _2_4 {

	/**
	 * 4.���������ж���һ���ļ������жϸ��ļ��Ƿ���ڡ�������ļ����ڣ�����ԭ�ļ���ͬ
	 * ·���´���һ���ļ���Ϊ��copy_ԭ�ļ����������ļ������ļ�����Ϊԭ�ļ��Ŀ����� ���磺���� /home/java/photo.jpg
	 * �򴴽�һ���ļ� /home/java/copy_photo.jpg ���ļ����ݺ�ԭ�ļ�������ͬ��
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// copyFile("D:\\Demo2");
//		copyFile(new File("D:\\Demo"));
		copyFile("D:\\Demo");
		
	}

	private static void copyFile(File f) throws IOException {
		// TODO Auto-generated method stub
		if (f.exists()) {
			//�ص�
			File newfile = new File(f.getParent(), "copy_" + f.getName());
			System.out.println("---- newFile" + newfile.getAbsolutePath());
			newfile.mkdirs();
			File[] files = f.listFiles();
			if (files == null) {
				System.out.println("files==null");// ˵������ļ����ǿյ�,Ҳ�������
				return;
			}
			for (File file : files) {
				//��һ���ǹؼ�
				File targetFile = new File(newfile, "copy_" + file.getName());
				System.out.println("------ targetFile " + targetFile.getAbsolutePath());
				if (file.isFile()) {
					InputStream in = new FileInputStream(file);
					OutputStream out = new FileOutputStream(targetFile);
					byte[] bys = new byte[1024];
					int len;
					while ((len = in.read(bys)) != -1) {
						out.write(bys, 0, len);

					}
				
					in.close();
					out.close();

				} else {
					copyFile(file);
				}
			}

		} else {
			System.out.println("���ļ���������");
		}

	}

	// �ָ��� ------------------------------------------------------------------
	public static void copyFile(String FileName) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(FileName);
//		System.out.println(f.getParent());
//		System.out.println(f.getName());
		// System.out.println(f.getPath());
		// System.out.println(f.getParent());
		// System.out.println(f.getName());
		// System.out.println(f.getParentFile());
		if (f.exists()) {
			//����ͬ·���´������ļ���:copy_+ԭ�ļ���
			File newFile =new File(f.getParent(),"copy_"+f.getName());
			newFile.mkdirs();
			System.out.println("newFile:"+newFile.getAbsolutePath());
			File[] files = f.listFiles();
			// System.out.println(files.length);
			if (files == null) {
				// File f2 = new File(f.getParent(), "copy_" + f.getName());
				// f2.mkdirs();
				return;
			}
			// for (File file : files) {
			// System.out.println(file.getPath());
			// }
			for (File file : files) {
				if (file.isFile()) {
					InputStream in = new FileInputStream(file);
					File targetFile = new File(newFile, "copy_"+ file.getName());
					OutputStream out = new FileOutputStream(targetFile);
					byte[] bys = new byte[1024];
					int len;
					while ((len = in.read(bys)) != -1) {
						out.write(bys, 0, len);

					}
					in.close();
					out.close();

				} else {
					copyFile(file.getPath());
				}
			}

		}else {
			System.out.println("��·��������!");
		}
	}

}
