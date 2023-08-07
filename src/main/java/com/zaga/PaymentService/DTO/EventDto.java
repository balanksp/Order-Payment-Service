package com.zaga.PaymentService.DTO;


import org.springframework.web.context.annotation.ApplicationScope;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApplicationScope
public class EventDto {
    private String account_number;
    private String name;
}
