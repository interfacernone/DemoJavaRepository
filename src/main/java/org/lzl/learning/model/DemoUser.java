package org.lzl.learning.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户
 * */
@Data
@TableName(value = "user")
public class DemoUser {

    /**
     * 主键
     * */
    @TableId(value = "id",type = IdType.AUTO)
    Long id;

    /**
     * 用户名
     * */
    @TableField(value = "user_name")
    String userName;

}
