package cn.why.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by why on 16-4-24.
 */
public class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("/home"+File.separator+"why"+File.separator+"demo"+File.separator+"output.txt");

        if (file.exists()) {

            FileInputStream fileInputStream = new FileInputStream(file);
            //读取单个字节
    //        int b = fileInputStream.read();
    //        System.out.println(String.valueOf(b));

            //读取内容到字节数组
    //        byte[] bytes = new byte[1024];
    //        fileInputStream.read(bytes);
    //        System.out.println(new String(bytes)+"]]]]");

            //读取内容到部门字节数组
    //        fileInputStream.read(bytes, 0, 7);
    //        System.out.println(new String(bytes)+"]]]]]");


            StringBuffer buffer = new StringBuffer();

            //使用这种一次读取多个字节到字节数组中需要考虑，声明的字节数组长度必须一次包含文件的所以内容，否则会出现读取字节显示乱码问题
            //此种读取方法不推荐
            byte[] bytes = new byte[1024];
    //        while ((fileInputStream.read(bytes)) != -1) {//读到的是数据
    //            fileInputStream.read(bytes);
    //            buffer.append(new String(bytes));
    //        }

            int footer = 0;
            //单个字节进行循环读取,读取的内容放入字节数组，依然需要考虑字节数组的大小必须包含所有的数据
            while ((fileInputStream.read()) != -1) {
                bytes[footer++] = (byte) fileInputStream.read();
            }

            System.out.println(buffer.toString() + "]]]]]");
            fileInputStream.close();
        }
    }

}
