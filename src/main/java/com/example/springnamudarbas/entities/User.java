package com.example.springnamudarbas.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private List<Post> posts;


}
