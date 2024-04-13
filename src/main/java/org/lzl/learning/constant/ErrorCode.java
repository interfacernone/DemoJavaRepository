package org.lzl.learning.constant;

/**
 * 自定义错误码
 */
public enum ErrorCode implements ErrorCodeInterface {
    /**
     * 用户登录时输入的密码错误
     * */
    PASSWORD_WRONG("PASSWORD_WRONG", "密码错误"),

    /**
     * 账号锁定错误
     * */
    ACCOUNT_LOCK_ERROR("ACCOUNT_LOCK_ERROR","账号输入密码错误次数过多，已被锁定");

    /**
     * 自定义错误码的代码
     * */
    String errorCode;

    /**
     * 自定义错误码的描述
     * */
    String errorDescription;

    ErrorCode(String errorCode, String errorDescription) {
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    @Override
    public String getErrorCode() {
        return null;
    }

    @Override
    public String getErrorDescription() {
        return null;
    }
}
