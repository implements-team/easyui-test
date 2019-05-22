package com.test.easyui.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String firstname;

    private String lastname;

    private  Long phone;

    private String email;
}
