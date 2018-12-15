package com.moluo.blog.exception;

/**
 * @author zzh
 * @date 2018/12/15
 */
public enum BlogError {
    /*
     * 错误代码以纯数字方式命名，共9位，xxx.yyyzzz，前三位xxx是应用码，中三位yyy是模块/资源码，后三位zzz是具体的错误码。
     *
     * xxx:应用码,按应用编码，如：
     *      001 博客系统
     *
     * yyy:模块/资源码,根据此应用下的模块/资源进行编码，如：
     *     001 用户模块
     *
     * zzz:错误码,顺序设定即可，其中404，400为预留错误
     *     404指资源号对应的资源不存在错误
     *     400为资源号对应的资源创建时参数错误
     */

    user_id_not_exist("001.001001","用户id不存在");


    private String code;
    private String message;

    BlogError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "("+this.code+")"+this.message;
    }
}
