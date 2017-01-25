package com.unclebae.parkinglogshare.example.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by KIDO on 2017. 1. 26..
 */
@Getter
public enum OrderType {

    ASC("ASC", "오름차순"),
    DESC("DESC", "내림차순")
    ;

    String code;
    String desc;

    OrderType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
