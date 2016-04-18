package com.zzy.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zzy.config.TestProperty;

@RestController
@RequestMapping("/api/configs")
public class ProfileController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    private TestProperty testProperty;

    @RequestMapping(method = RequestMethod.GET, value = "server")
    public TestProperty get() {
        logger.info("testProperty port : {}", testProperty.getPort());
        return testProperty;
    }
}
