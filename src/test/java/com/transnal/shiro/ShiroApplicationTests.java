package com.transnal.shiro;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.authz.permission.WildcardPermissionResolver;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroApplicationTests {
    //日志
     private static Logger logger= LoggerFactory.getLogger(ShiroApplicationTests.class);
	@Test
	public void contextLoads() {
		DefaultSecurityManager securityManager=new DefaultSecurityManager();
		ModularRealmAuthenticator authenticator=new ModularRealmAuthenticator();
		authenticator.setAuthenticationStrategy(new AtLeastOneSuccessfulStrategy());
		securityManager.setAuthenticator(authenticator);
		ModularRealmAuthorizer authorizer=new ModularRealmAuthorizer();
		authorizer.setPermissionResolver(new WildcardPermissionResolver());
		securityManager.setAuthorizer(authorizer);
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/shiro");
        ds.setUsername("root");
        ds.setPassword("root");
        JdbcRealm jdbcRealm=new JdbcRealm();
        jdbcRealm.setDataSource(ds);
        jdbcRealm.setPermissionsLookupEnabled(true);
        securityManager.setRealm(jdbcRealm);
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("zhang","123");
        try{
            subject.login(token);
        }catch (AuthenticationException exception){
             logger.info(exception.getMessage());
        }
        logger.info("println:"+subject.isAuthenticated());
        subject.logout();
	}
	@Test
	public void encryption(){
            String str="hello";
            String base64Encoded= Base64.encodeToString(str.getBytes());
            String str2=Base64.decodeToString(base64Encoded);
             logger.info(str.equals(str2)+"");
             //MD5加盐
           String s = new Md5Hash(str, str2).toString();

    }
    @Test
    public  void eumTest(){
        logger.info("------------------------");
        logger.info("测试开始");
	    for (Shrubbery s:Shrubbery.values()){
	        logger.info(s+"ordinal:"+s.ordinal());
	        logger.info(s.compareTo(Shrubbery.CRAWLING)+"");
	        logger.info(s.equals(Shrubbery.CRAWLING)+"");
	        logger.info(s.getDeclaringClass()+"");
	        logger.info(s.name());
            logger.info(Shrubbery.valueOf("CRAWLING")+"");
            logger.info(s.getDescription());
            logger.info("------------------------");
        }
        logger.info("测试结束");
    }

}
