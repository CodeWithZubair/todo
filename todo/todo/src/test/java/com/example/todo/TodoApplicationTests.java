package com.example.todo;

import com.example.todo.TodoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TodoApplicationTests {

    @Autowired
    private TodoService todoService;

    @Test
    void testGetAllTodos() {
        List<Todo> todos = todoService.getAllTodos();
        assertNotNull(todos);
    }
}
