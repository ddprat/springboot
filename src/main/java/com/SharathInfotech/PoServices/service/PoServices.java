package com.SharathInfotech.PoServices.service;

import com.SharathInfotech.PoServices.model.PO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class PoServices {



    public PO savepo(PO po) {
        return po;
    }
}
