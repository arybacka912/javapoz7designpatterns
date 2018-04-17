package com.sda.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserWithLombok {

    private String firstName;
    private String lastName;
    private String birthDate;
    private String phoneNumber;
}
