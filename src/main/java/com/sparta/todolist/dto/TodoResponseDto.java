package com.sparta.todolist.dto;


import com.sparta.todolist.entity.Todo;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodoResponseDto {
    //private Long todoid;
    private String title;
    //private String content;
    private String maker;
    private String date;
    private boolean finish;


    public TodoResponseDto(Todo todo) {
        this.title = todo.getTitle();
        this.maker = todo.getMaker();
        this.date = todo.getDate();
        this.finish = todo.isFinish();
    }
}
