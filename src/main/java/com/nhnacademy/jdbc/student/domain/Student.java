package com.nhnacademy.jdbc.student.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Student {

    public enum GENDER{
        M,F
    }
    private final String id;
    private final String name;
    private final GENDER gender;
    private final Integer age;
    private final LocalDateTime createdAt;

    //todo#0 필요한 method가 있다면 추가합니다.

    public Student(String id, String name, GENDER gender, Integer age, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.createdAt = createdAt;

    }
}
