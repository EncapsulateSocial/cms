package com.encapsulate.cms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String title;
    private Author author;
    private List<String> tags;
    private List<String> keywords;
    private String body;
    private Date createdAt;
    private Date lastUpdatedAt;
}
