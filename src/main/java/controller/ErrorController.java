package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.NameService;

@Controller
public class ErrorController {

    @Autowired
    private NameService nameService;

    @RequestMapping(value="/error", method= RequestMethod.GET)
    public String getError() {
        return "error";
    }
    }