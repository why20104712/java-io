package cn.why.io;

/**
 * 文件编码，默认是GBK
 * Created by why on 2016/4/25.
 */
public class FileEncodingDemo {

    public static void main(String[] args) {
        //列出系统相关属性信息
        System.getProperties().list(System.out);
        //user.dir=E:\Intellij\java-io
        //sun.jnu.encoding=GBK
        //file.encoding=UTF-8
        /**
         * 常用的字符编码
         * GBK,GB2312
         * ISO8895-1
         * UNICODE
         * UTF
         * 导致乱码的原因：编码和解码的字符集不一致
         */
    }
}
