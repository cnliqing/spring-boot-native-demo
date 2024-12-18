package com.li.example.nativedemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.li.example.nativedemo.entity.Messages;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nieqiurong
 */
@Mapper
public interface MessagesMapper extends BaseMapper<Messages> {

}
