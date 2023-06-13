package cn.qqa.monitor.pkg.shiro.token;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author MrLi
 * @date 2023-02-17 17:11
 **/
public class SPBUsernamePasswordToken extends UsernamePasswordToken {
    public SPBUsernamePasswordToken() {
    }

    public SPBUsernamePasswordToken(String userNumber, String password) {
        super(userNumber, password);
    }
}
