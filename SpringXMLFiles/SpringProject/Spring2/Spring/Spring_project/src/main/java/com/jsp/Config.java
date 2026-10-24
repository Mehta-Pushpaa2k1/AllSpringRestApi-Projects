package com.jsp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration     // it is used to mark as the config file
@ComponentScan(basePackages = {"com.jsp","com.qsp"})      // it used to scan the spring bean in a particular location
public class Config {
}
