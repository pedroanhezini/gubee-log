package com.log.gubeelog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static net.logstash.logback.argument.StructuredArguments.fields;


@RestController
public class LoggingController {

    private Logger logger = LoggerFactory.getLogger("integrationLogger");

    @RequestMapping("log/")
    public String index() {
        MyClass myClass = new MyClass("Pedro", 22);
        logger.info("An INFO Message {}", fields(myClass));
        return "Howdy! Check out the Logs to see the output...";
    }
}
