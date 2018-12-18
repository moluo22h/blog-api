package com.moluo.blog.config.properties;

/**
 * @author zzh
 * @date 2018/12/17
 */
public class BrowserProperties {

    private String loginPage = "/SignIn.html";

    private LoginType loginType=LoginType.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }
}
