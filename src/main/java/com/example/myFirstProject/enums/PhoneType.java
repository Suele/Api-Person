package com.example.myFirstProject.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("Home"),
    MOBILE("MOBILE"),
    COMMERCIAL("COMMERCIAL");

    private final String description;




}
