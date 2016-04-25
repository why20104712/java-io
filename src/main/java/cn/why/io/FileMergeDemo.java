package cn.why.io;

import java.io.*;

/**
 * 文件合并
 * 内存流
 * 使用ByteArrayOutputStream的特有方法toByteArray
 * Created by why on 2016/4/25.
 */
public class FileMergeDemo {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("E:" + File.separator + "demo" + File.separator + "source.txt");//源文件
        File outputFile = new File("E:" + File.separator + "demo" + File.separator + "target.txt");//目标文件

        /**
         * 分别将文件内容读取到内存输入流中，
         * 使用ByteArrayOutputStream的特有方法toCharArray将内存中的数据转换为字符数组，从而实现文件的合并
         */
        InputStream inputStream1 = new FileInputStream(inputFile);
        InputStream inputStream2 = new FileInputStream(outputFile);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = inputStream1.read()) != -1) {
            byteArrayOutputStream.write(temp);
        }
        while ((temp = inputStream2.read()) != -1) {
            byteArrayOutputStream.write(temp);
        }

        byte[] bytes = byteArrayOutputStream.toByteArray();
        System.out.println(new String (bytes));


    }
}
