package org.lzl.learning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.lzl.learning.model.DemoUser;

@Mapper
public interface UserMapper extends BaseMapper<DemoUser> {
}
