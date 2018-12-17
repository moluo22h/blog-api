package com.moluo.blog.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zzh
 * @date 2018/12/17
 */
@ConfigurationProperties(prefix = "moluo.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
