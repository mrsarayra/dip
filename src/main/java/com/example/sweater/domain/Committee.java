package com.example.sweater.domain;

import javax.persistence.*;


@Entity
@Table(name = "committee", schema = "public", catalog = "")
public class Committee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "title")
    private String title;
    @Column(name = "body")
    private String body;

    public Committee() {
    }

    public Committee(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}