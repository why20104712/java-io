package cn.why.io;

import java.io.*;

/**
 * 字节流与字符流的转化
 */
public class OutputStreamWriterDemo {

    public static void main(String[] args) throws IOException {
        //定义文件路径
        File file = new File("E:" + File.separator + "demo" + File.separator + "output.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        OutputStream outputStream = new FileOutputStream(file);//字节流
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);//字符流
        String str = "字符流输1111出";
        outputStreamWriter.write(str);

        outputStreamWriter.flush();
        outputStreamWriter.close();
        outputStream.close();
    }
}
