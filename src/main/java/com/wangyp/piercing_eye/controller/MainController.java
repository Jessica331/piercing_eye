package com.wangyp.piercing_eye.controller;

import com.wangyp.piercing_eye.domain.Person;
import com.wangyp.piercing_eye.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    PersonService personService;
    /**
     * String 类型的返回值， 会找模板文件
     * @return
     */
    @RequestMapping("/test")
    public String test() {
        System.out.println("/main/test");
        return "test";
    }

    @RequestMapping("/list")
    public String list(ModelMap modelMap) {
        List<Person> personList = personService.findAll();
        System.out.println("/main/list");
        System.out.println(personList.size());
        return "list";
    }

    @RequestMapping("/add")
    public Boolean add(@RequestParam("pid") Integer pid, @RequestParam("pname") String pname, @RequestParam("ppsd") String ppsd) {
        boolean success = personService.add(pid, pname, ppsd);
        return success;
    }

    @RequestMapping("/delete")
    public String delete(ModelMap modelMap) {
        List<Person> personList = personService.findAll();
        return "delete";
    }

    @RequestMapping("/update")
    public String update(ModelMap modelMap) {
        List<Person> personList = personService.findAll();
        return "update";
    }

}
