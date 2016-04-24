package cn.why.io;

import java.io.*;

/**
 * Created by why on 16-4-24.
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建文件对应的路径
        File file = new File("/home"+File.separator+"why"+File.separator+"demo"+File.separator+"output.txt");

        //文件目录不存在就创建目录
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        /**
         * ３种方法输出
         * 输出单个字节
         * 输出字节数组
         * 输出部分字节数组
         */
        //使用子类实例化父类的刘对象
        OutputStream outputStream = new FileOutputStream(file, true);
        String str = "ABCD这是输出流测试\r\n";
        //输出字符数组
//        outputStream.write(str.getBytes());
        //输出指定长度的字节
        //常用中文字符用utf-8编码占用3个字节（大约2万多字），但超大字符集中的更大多数汉字要占4个字节（在unicode编码体系中，U+20000开始有5万多汉字）。
        //GBK、GB2312收编的汉字占2个字节，严格地用iso8859-1无法表示汉字，只能转为问号。
//        outputStream.write(str.getBytes(),0,6);
        //输出单个字节
        for (int i = 0; i<str.getBytes().length; i++) {
            outputStream.write(str.getBytes()[i]);
        }
        //关闭流资源
        outputStream.close();
    }
}
