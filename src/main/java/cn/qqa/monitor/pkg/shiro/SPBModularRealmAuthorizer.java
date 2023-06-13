package cn.qqa.monitor.pkg.shiro;

import org.apache.shiro.authz.Authorizer;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Iterator;

/**
 * @author MrLi
 * @date 2023-02-17 16:03
 **/
public class SPBModularRealmAuthorizer extends ModularRealmAuthorizer {
    @Override
    public boolean hasRole(PrincipalCollection principals, String roleIdentifier) {
        this.assertRealmsConfigured();
        Iterator var3 = this.getRealms().iterator();

        Realm realm;
        do {
            if (!var3.hasNext()) {
                return false;
            }

            realm = (Realm)var3.next();
        } while(!(realm instanceof Authorizer) || !((Authorizer)realm).hasRole(principals, roleIdentifier));

        return true;
    }
}
