package cn.why.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符输出流操作
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        //定义文件路径
        File file = new File("E:" + File.separator + "demo" + File.separator + "output.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        //使用子类实例化字符流对象
        Writer writer = new FileWriter(file);
        String str = "字符流输出";
        writer.write(str);//输出字符串
        //字符流与字节流的区别就是：字符流使用了缓存区，如果不关闭资源或者flush，内容是不会从缓冲区写到文件
        writer.flush();//强制清空缓冲区
        writer.close();//关闭资源
    }

}
