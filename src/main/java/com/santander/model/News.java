package com.santander.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tb_news")
public class News extends BaseItem {

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
