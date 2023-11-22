package com.SharathInfotech.PoServices.controller;

import com.SharathInfotech.PoServices.model.PO;
import com.SharathInfotech.PoServices.service.PoServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/poservices")
@Slf4j
public class PoController {
 @Autowired
    private PoServices poServices;

    @PostMapping("/newpo")
    public PO savepo(@RequestBody PO po){
        return poServices.savepo(po);
    }





}
