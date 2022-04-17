package com.example._2consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Any properties not bound in this type should be ignored.
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    // To directly bind your data to your custom types, you need to specify the variable name to be exactly the same as the key in the JSON document returned from the API.
    // In case your variable name and key in JSON doc do not match, you can use @JsonProperty annotation to specify the exact key of the JSON document.
    private String id;
    private String name;
    private String username;
    private String email;
    private Address address;

    public User() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}