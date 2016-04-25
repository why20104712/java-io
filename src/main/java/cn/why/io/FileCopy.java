package cn.why.io;

import java.io.*;

/**
 * 文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {

        long begin = System.currentTimeMillis();
        File inputFile = new File("E:" + File.separator + "demo" + File.separator + "source.txt");//源文件
        File outputFile = new File("E:" + File.separator + "demo" + File.separator + "target.txt");//目标文件

        if (!inputFile.exists()) {//源文件不存在，程序退出
            System.exit(1);
        }

        if (!outputFile.getParentFile().exists()) {//目标文件目录不存在，创建目录
            outputFile.getParentFile().mkdirs();
        }

        InputStream inputStream = new FileInputStream(inputFile);//字节输入流
        OutputStream outputStream = new FileOutputStream(outputFile);//字节输出流

        int temp = 0;//用于记录读取数据的长度
        byte[] bytes = new byte[1024];//每次读取的文件数组
        while ((temp = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, temp);//每次写出数组
        }
        outputStream.close();
        inputStream.close();
        long end = System.currentTimeMillis();
        System.out.println("copy time: "+ (end - begin));//copy操作花费的时间
    }
}
