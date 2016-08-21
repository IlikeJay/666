package cn.OldDriver作业2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _2_4 {

	/**
	 * 4.从命令行中读入一个文件名，判断该文件是否存在。如果该文件存在，则在原文件相同
	 * 路径下创建一个文件名为“copy_原文件名”的新文件，该文件内容为原文件的拷贝。 例如：读入 /home/java/photo.jpg
	 * 则创建一个文件 /home/java/copy_photo.jpg 新文件内容和原文件内容相同。
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
			//重点
			File newfile = new File(f.getParent(), "copy_" + f.getName());
			System.out.println("---- newFile" + newfile.getAbsolutePath());
			newfile.mkdirs();
			File[] files = f.listFiles();
			if (files == null) {
				System.out.println("files==null");// 说明如果文件夹是空的,也不会进来
				return;
			}
			for (File file : files) {
				//这一步是关键
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
			System.out.println("该文件名不存在");
		}

	}

	// 分割线 ------------------------------------------------------------------
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
			//在相同路径下创建新文件夹:copy_+原文件名
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
			System.out.println("此路径不存在!");
		}
	}

}
