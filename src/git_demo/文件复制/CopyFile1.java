package git_demo.文件复制;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
* 将文件复制到指定的目录
*/
public class CopyFile1 {

	public static void main(String[] args) {
		// 将F盘下的test.txt文件复制到D盘
		System.out.println("开始复制。。");
		copy("D:/test1.txt", "D:/test2.txt");
		System.out.println("复制成功！");
	}

	public static void copy(String src, String dest) {
		// 准备复制源文件和目的地
		File srcFile = new File(src);
		File destFile = new File(dest);

		// 准备输入输出流
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(destFile);

			byte[] flush = new byte[1024];
			int len = -1;

			// 边读边写
			while ((len = in.read(flush)) != -1) {
				out.write(flush, 0, len);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			// 关闭原则，先用后关
			// 关闭输出流
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			// 关闭输入流
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}// copy

}
