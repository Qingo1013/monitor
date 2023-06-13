package cn.qqa.monitor.pkg.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.authc.pam.ShortCircuitIterationException;
import org.apache.shiro.realm.Realm;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author MrLi
 * @date 2023-02-17 16:03
 **/
public class SPBModularRealmAuthenticator extends ModularRealmAuthenticator {
    @Override
    protected AuthenticationInfo doMultiRealmAuthentication(Collection<Realm> realms, AuthenticationToken token) {
        AuthenticationStrategy strategy = this.getAuthenticationStrategy();
        AuthenticationInfo aggregate = strategy.beforeAllAttempts(realms, token);


        Iterator var5 = realms.iterator();

        while (var5.hasNext()) {
            Realm realm = (Realm) var5.next();

            try {
                aggregate = strategy.beforeAttempt(realm, token, aggregate);
            } catch (ShortCircuitIterationException var11) {
                break;
            }

            if (realm.supports(token)) {
                AuthenticationInfo info = null;
                Throwable t = null;
                info = realm.getAuthenticationInfo(token);
                if (info == null) {
                    String msg = "Realm [" + realm + "] was unable to find account data for the submitted AuthenticationToken [" + token + "].";
                    throw new UnknownAccountException(msg);
                }
                aggregate = strategy.afterAttempt(realm, token, info, aggregate, t);
            }

        }

        aggregate = strategy.afterAllAttempts(token, aggregate);
        return aggregate;
    }


}
