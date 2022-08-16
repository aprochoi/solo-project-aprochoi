package com.soloproject.Soloproject.api.v1.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class member {
    private long id;
    private String name;
    private String password;
    private String sex;
    private String company_name;
    private long company_type;
    private long company_location;
}
