package cn.why.io;

import java.io.*;

/**
 * 字符流操作
 */
public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        //定义文件路径
        File file = new File("E:" + File.separator + "demo" + File.separator + "output.txt");
        if (file.exists()) {
            Reader reader = new FileReader(file);
            char[] ch = new char[1024];
            reader.read(ch);
            System.out.println(new String(ch));
            reader.close();
        }
    }
}
