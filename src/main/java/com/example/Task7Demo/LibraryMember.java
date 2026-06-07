package com.example.Task7Demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class LibraryMember {
    private String memberId;
    private String fullName;
    private String membershipType;
}
