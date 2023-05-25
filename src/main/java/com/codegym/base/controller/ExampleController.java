package com.codegym.base.controller;

import com.codegym.base.core.controller_base.BaseController;
import com.codegym.base.dto.ExampleDTO;
import com.codegym.base.service.ExampleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController extends BaseController<ExampleService, ExampleDTO> {

}
