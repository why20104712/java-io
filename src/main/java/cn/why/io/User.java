package cn.why.io;

import java.io.Serializable;

/**
 * Created by why on 16-5-2.
 */
public class User implements Serializable {
    private String name;

    private transient String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
