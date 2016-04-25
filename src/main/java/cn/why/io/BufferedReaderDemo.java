package cn.why.io;

import java.io.*;

/**
 * 字符缓冲流
 * Created by why on 2016/4/25.
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "demo" + File.separator + "output.txt");
        if (file.exists()) {

            InputStream inputStream = new FileInputStream(file);
            //字节流转换为字符流，然后使用缓冲流包装
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            //readLine()重要的方法，可以读取一行转换成字符串

            String str = "";
            StringBuffer stringBuffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                stringBuffer.append(str+'\n');
//                System.out.println(str);
            }

            System.out.println(stringBuffer.toString());

            bufferedReader.close();
            inputStream.close();
        }
    }
}
