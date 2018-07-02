package com.gamaza.examples.springmongodb.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document(collection = "users")
public class User {

    @Id
    private ObjectId id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surnames;

    @Column(nullable = false)
    private String description = "No description";

    public User(){}

    public User(ObjectId id, String name, String surnames, String description) {
        this.id = id;
        this.name = name;
        this.surnames = surnames;
        this.description = description;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", surnames='" + surnames + '\'' + ", description='" + description + '\'' + '}';
    }
}
