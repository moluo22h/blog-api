package com.moluo.blog.config;

/**
 * @author zzh
 * @date 2018/12/17
 */
public class SimpleResponse {
private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
