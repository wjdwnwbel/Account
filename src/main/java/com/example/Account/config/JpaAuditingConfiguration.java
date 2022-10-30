package com.example.Account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class JpaAuditingConfiguration {
}

// 이 클래스 자체가 어플리케이션을 구동할 때 자동으로 스캔하여 빈으로 등록하고 JpaAuditin을 사용할 수 있게됨
