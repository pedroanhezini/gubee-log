package com.log.gubeelog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static net.logstash.logback.argument.StructuredArguments.keyValue;


@RestController
public class LoggingController {

    private Logger logger = LoggerFactory.getLogger("jsonLogger");

    @RequestMapping("log/")
    public String index() {
        logger.trace("A TRACE Message {}", keyValue("orderId", "123"));
        logger.debug("A DEBUG Message {}", keyValue("orderId", "123"));
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Howdy! Check out the Logs to see the output...";
    }
}
