package com.careerit.cj.other;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillItem {

    private long id;
    private String description;
    private Day day;
    private double amount;
}
