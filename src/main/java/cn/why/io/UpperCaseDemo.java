package cn.why.io;

import java.io.*;

/**
 * 内存输入流
 * 实现小写英文字母转为大写
 * Created by why on 2016/4/25.
 */
public class UpperCaseDemo {

    public static void main(String[] args) throws IOException {

        String str = "hello world";//需要转换的字母
        InputStream inputStream = new ByteArrayInputStream(str.getBytes());//内存输出流
        OutputStream outputStream = new ByteArrayOutputStream();//内存输入流

        int temp = 0;
        while ((temp = inputStream.read()) != -1) {
            outputStream.write(Character.toUpperCase(temp));//输入到内存
        }

        System.out.println(outputStream);
        //关闭资源
        outputStream.close();
        inputStream.close();

    }
}
