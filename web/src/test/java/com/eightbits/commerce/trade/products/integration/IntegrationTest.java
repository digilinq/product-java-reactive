package com.eightbits.commerce.trade.products.integration;

import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Tag("IntegrationTest")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = {"server.port=0"})
@AutoConfigureMockMvc
@ActiveProfiles(profiles = {"test"})
@Retention(RetentionPolicy.RUNTIME)
public @interface IntegrationTest {
}
