package corejava.ch11.ex.e3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class Convert {
	private static BufferedReader br;
	private static BufferedWriter bw;
	private static PrintWriter pw;
	
	public static void main(String[] args) {
		try {
			br= new BufferedReader(new InputStreamReader(new FileInputStream(new 
					File("src\\ch11\\ex\\e3\\a.txt")),"UTF-8"));
			bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new 
					File("D:\\360data\\重要数据\\桌面\\b.txt")),"GBK"));
			
			InputStream is = Convert.class.getResourceAsStream("values.properties");
			Properties pro=new Properties();
			
			pro.load(is);
			String reStr = pro.getProperty("reStr");
			String str="";
//			String reAll="";
//			String reStr="rgre";
			while((str=br.readLine())!=null) {
				String reAll = str.replace("***********", reStr);
				 System.out.println(reAll);
				 bw.write(reAll+"\n");
			}
			bw.flush();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				try {
					if(br!=null)
					br.close();
					if(pw!=null)
						pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}
}
