package cn.qqa.monitor.pkg.shiro.realm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author MrLi
 * @date 2023-02-17 17:11
 **/
@Slf4j
public class UsernamePasswordRealm extends AuthorizingRealm {
//    @Autowired
//    private UserDao userDao;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        SPBUsernamePasswordToken token = (SPBUsernamePasswordToken) authenticationToken;
//        log.info("{}用户进行密码登录", token.getUsername());
//        Optional<SpbUser> spbUser = Optional.ofNullable(userDao.selectOne(new LambdaQueryWrapper<SpbUser>().eq(
//            SpbUser::getUserNumber,
//            token.getUsername()
//        )));
//        // 设置session
//        spbUser.ifPresent(user -> SessionUtil.setUserId(user.getId()));
//        // 如果为null, 则会
//        return spbUser.map(value -> new SimpleAuthenticationInfo(token.getUsername(), value.getPwd(), getName())).orElse(null);
//
        return  null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        // 给subject进行授权
//        System.out.println("密码授权ing..");
//        Subject subject = SecurityUtils.getSubject();
//        // 通过数据库来拿到 用户拥有的权限
//        String username = (String) subject.getPrincipal();
//
//        Optional<SpbUser> spbUser = Optional.ofNullable(userDao.selectOne(new LambdaQueryWrapper<SpbUser>().eq(
//            SpbUser::getUserNumber,
//            username
//        )));
//
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addRole(spbUser.map(SpbUser::getRoleName).orElse(""));
//        return info;
        return null;
    }

    @Override
    public boolean supports(AuthenticationToken token) {
//        return super.supports(token) && SPBUsernamePasswordToken.class.isAssignableFrom(token.getClass());
        return true;
    }
}
