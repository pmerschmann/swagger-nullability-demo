package com.my.company.api;

import com.my.company.data.MyObject;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Validated
public interface TestApi {

    @GetMapping("/test")
    @Operation(
            summary = "Some mocked data",
            description =
                    "Does nothing, just for testing purposes.",
            tags = {"Test Data"})
    ResponseEntity<MyObject> doNothing();
}
