package com.ino.springex.mapper;

import com.ino.springex.domain.TodoVO;

public interface TodoMapper {
    String getTime();

    void insert(TodoVO todoVO);
}
