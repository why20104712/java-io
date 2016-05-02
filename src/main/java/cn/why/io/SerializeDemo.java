package cn.why.io;

import com.sun.deploy.util.ReflectionUtil;
import javafx.scene.effect.ReflectionBuilder;
import sun.reflect.ReflectionFactory;

import java.io.*;

/**
 * 对象序列化
 * 需要实现接口Serializable,用于标示该类可以被序列化
 * 在属性前面使用修饰符transient,可以不序列化该属性
 * Created by why on 16-5-2.
 */
public class SerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("/home/why" + File.separator + "User.txt");
//        if (!file.exists()) {
//            file.createNewFile();
//        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        User user = new User();
        user.setName("aaa");
        user.setPassword("sdfd");

        //序列化
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        fileOutputStream.close();

        //反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User user1 = (User) objectInputStream.readObject();
        System.out.println(user1.getName());
    }


}
