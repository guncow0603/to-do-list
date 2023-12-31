package com.sparta.todolist.controller;


import com.sparta.todolist.dto.TodoRequestDto;
import com.sparta.todolist.dto.TodoResponseDto;
import com.sparta.todolist.dto.TodoTitleContentRequestDto;
import com.sparta.todolist.security.UserDetailsImpl;
import com.sparta.todolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/todo")
    public TodoResponseDto createTodo(@RequestBody TodoRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return todoService.createTodo(requestDto, userDetails.getUser());    // ?
    }

    @PutMapping("/todo/{id}")
    public TodoResponseDto updateTodo(@PathVariable Long id, @RequestBody TodoTitleContentRequestDto requestDto) {
        return todoService.updateTodo(id, requestDto);
    }

    @GetMapping("/todos")
    public List<TodoResponseDto> getTodos(){
        return todoService.getTodos();
    }

    @GetMapping("/todo/{id}")
    public TodoResponseDto getTodoById(@PathVariable Long id){
        return todoService.getTodo(id);
    }
}
