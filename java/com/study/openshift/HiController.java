package com.study.openshift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HiController {
@RequestMapping(value="/" )
public String sayhello() {
	return "Hello Amol from openshift.";
}
}
