package com.study.openshift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/api" )
public class HiController {
@RequestMapping(value="/hello" )
public String sayhello() {
	return "Hello there from openshift.";
}
}
