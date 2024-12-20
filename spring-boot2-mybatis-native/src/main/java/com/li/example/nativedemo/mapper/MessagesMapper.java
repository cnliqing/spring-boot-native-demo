package com.li.example.nativedemo.mapper;

import com.li.example.nativedemo.entity.Messages;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nieqiurong
 */
@Mapper
public interface MessagesMapper {

    int insert(Messages messages);

    Messages select(Long id);

}
