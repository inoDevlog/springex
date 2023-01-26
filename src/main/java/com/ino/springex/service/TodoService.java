package com.ino.springex.service;

import com.ino.springex.dto.PageRequestDTO;
import com.ino.springex.dto.PageResponseDTO;
import com.ino.springex.dto.TodoDTO;

public interface TodoService {

    void register(TodoDTO todoDTO);

    //    List<TodoDTO> getAll();
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);
}
