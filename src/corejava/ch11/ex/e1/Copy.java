package corejava.ch11.ex.e1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

public class Copy {
	private static BufferedReader br;
	private static PrintWriter pw;
	public static void main(String[] args) throws IOException {
		
		File f= new File("D:\\360data\\重要数据\\桌面\\readme.txt");
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getParentFile());
		System.out.println(f.toURI());
		
		br=new BufferedReader(new FileReader("D:\\360data\\重要数据\\桌面\\readme.txt"));
		pw=new PrintWriter(new FileWriter("D:\\360data\\重要数据\\桌面\\pw.doc"));
		String line=null;
		while((line=br.readLine())!=null) {
			pw.println(line);
			System.out.print(line);
		}
		pw.flush();
		System.out.println("复制成功!");
		
		if(pw!=null)pw.close();
		if(br!=null)br.close();
	}
}
