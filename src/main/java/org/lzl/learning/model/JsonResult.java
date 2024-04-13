package org.lzl.learning.model;

import lombok.Data;
import org.lzl.learning.constant.ErrorCode;

/**
 * 企业级开发 Controller 返回值
 * Data是返回的数据
 *
 * @author 刘子凌 2024-3-30 11:26:00
 */
@Data
public class JsonResult<T> {
    String msg;
    T data;
    Boolean success;
    ErrorCode errorCode;

    /**
     * 返回有数据
     */
    public JsonResult(Boolean success, String msg, T data) {
        this.success = success;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 返回无数据
     */
    public JsonResult(Boolean success, String msg, ErrorCode errorCode) {
        this.success = success;
        this.msg = msg;
        this.errorCode = errorCode;
    }

    /**
     * 返回无数据
     */
    public JsonResult(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }
}
