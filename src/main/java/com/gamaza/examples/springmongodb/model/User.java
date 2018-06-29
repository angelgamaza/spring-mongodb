package com.gamaza.examples.springmongodb.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "users")
public class User {

    private ObjectId id;

    @NotNull
    private String name;

    @NotNull
    private String surnames;

    private String description = "No description";

    public User(){}

    public User(ObjectId id, @NotNull String name, @NotNull String surnames, @NotNull String description) {
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
