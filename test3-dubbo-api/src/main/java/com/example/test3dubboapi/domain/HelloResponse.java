package com.example.test3dubboapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class HelloResponse implements Serializable {

    private String result;
}
