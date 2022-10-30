package com.example.Account.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

// 클라이언트와 어플리케이션 간에 사용
public class AccountInfo {
    private String accountNumber;
    private Long balance;
}
