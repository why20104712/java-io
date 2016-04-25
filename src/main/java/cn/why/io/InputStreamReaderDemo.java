package cn.why.io;

import java.io.*;

/**
 * 字节流与字符流的转化
 */
public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {
        //定义文件路径
        File file = new File("E:" + File.separator + "demo" + File.separator + "output.txt");
        if (file.exists()) {
            InputStream inputStream = new FileInputStream(file);//字节流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//字符流

            char[] ch = new char[1024];
            inputStreamReader.read(ch);
            System.out.println(new String(ch));

            inputStreamReader.close();
            inputStream.close();
        }
    }
}
