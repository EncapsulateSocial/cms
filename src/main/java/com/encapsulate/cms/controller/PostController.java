package com.encapsulate.cms.controller;

import com.encapsulate.cms.model.Post;
import com.encapsulate.cms.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @GetMapping("/{id}")
    public Response getPost(@PathVariable String id) {
        return Response.generateResponse(HttpStatus.OK.name(), new Post(), "get post");
    }

    @PostMapping("/")
    public Response createPost(@RequestBody Post post) {
        return Response.generateResponse(HttpStatus.OK.name(), null, "create post");
    }
}