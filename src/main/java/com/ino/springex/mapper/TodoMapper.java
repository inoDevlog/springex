package com.ino.springex.mapper;

import com.ino.springex.domain.TodoVO;
import com.ino.springex.dto.TodoDTO;

import java.util.List;

public interface TodoMapper {
    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();

    TodoVO selectOne(Long tno);

    void delete(Long tno);

    void update(TodoDTO todoDTO);

}
