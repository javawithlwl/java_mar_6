package com.careerit.cj.jdbc;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {

    private int id;
    private String name;
    private String email;
    private String mobile;
}
