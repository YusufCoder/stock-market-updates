package com.stock.market.updates.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yelrhailani on 21/01/2018.
 */

@RestController
@RequestMapping("/api/stock/")
public class CheckStockController {

    @GetMapping("/")
    @ResponseStatus(value = HttpStatus.OK)
    public String executeUpload() {
        return "OK";
    }
}
