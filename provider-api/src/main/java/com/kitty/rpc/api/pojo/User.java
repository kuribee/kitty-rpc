package com.kitty.rpc.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName User
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String username;

    private String password;

    private Integer age;
}
