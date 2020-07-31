package com.mnzit.demo.log4j;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        log.debug("This is debug");
        log.info("This is info");
        log.error("This is error");
        log.trace("This is trace");
    }
}
