package com.my.company.api;

import com.my.company.data.MyObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestDataController implements TestApi {

    public TestDataController() {
        // do nothing
    }

    @Override
    public ResponseEntity<MyObject> doNothing() {
        return ResponseEntity.ok(null);
    }
}
