package com.zzy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/arg")
public class ArgController {

    @ModelAttribute
    private ArgForm addArgForm() {
        ArgForm argForm = new ArgForm();
        argForm.setOther("ModelAttribute init");
        return argForm;
    }

    // 测试uri http://localhost:8080/mvcHello/eg/arg/testModel/v1/2?name=parm&other=what
    @RequestMapping("/testModel/v1/{id}")
    @ResponseBody
    public ArgForm testArg(@ModelAttribute ArgForm argForm) {
        return argForm;
    }

}
