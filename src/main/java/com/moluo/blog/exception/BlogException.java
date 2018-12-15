package com.moluo.blog.exception;

/**
 * @author zzh
 * @date 2018/12/15
 */
public class BlogException extends RuntimeException {

    private BlogError blogError;

    public BlogException(BlogError blogError) {
        super(blogError.toString());
    }

    public BlogException(BlogError blogError, Throwable cause) {
        super(blogError.toString(), cause);
    }
}
