package git_demo.文件复制;

import java.io.*;
public class CopyFile2 {
	public static void main(String[] args) {
		//定义变量
		FileInputStream fi=null;
		FileOutputStream fo=null;
		
		try {
			//初始化IO流对象
			fi=new FileInputStream("d:/text1.txt");
			fo=new FileOutputStream("d:/test2.txt");
			
			//定义字节数组，用来存放输入流读取的字节
			byte[] b=new byte[1024];
			//定义一个整型len，主要用来记录输入流读取字节长度，
			//1 判断文件是否读取完毕 2 确定输出流写入到文件的字节数
			int len=0;
			
			//输入流读取文件到末尾时，返回-1
			while((len=fi.read(b))!=-1) {
				//输出流将字节数组写入到文件中去
				fo.write(b, 0, len);
			}
			
			System.out.println("复制完成!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭IO流
			if(fi!=null) {
				try {
					fi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fo!=null) {
				try {
					fo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
