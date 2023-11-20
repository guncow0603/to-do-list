package com.sparta.todolist.dto;

import com.sparta.todolist.entity.Todo;

public class TodosResponseDto {
    //private Long todoid;
    private String title;
    //private String content;
    private String maker;
    private String date;
    private boolean finish;


    public TodosResponseDto(Todo todo) {
        this.title = todo.getTitle();
        this.maker = todo.getMaker();
        this.date = todo.getDate();
        this.finish = todo.isFinish();
    }
}
