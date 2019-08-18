package com.review.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Autor xdbrian.steventh@gmail.com
 */
@RestController(value = "/api/v1")
public class ClientController {


    @GetMapping(value = "/clients")
    public String getAll() {
        return "first review";
    }

}