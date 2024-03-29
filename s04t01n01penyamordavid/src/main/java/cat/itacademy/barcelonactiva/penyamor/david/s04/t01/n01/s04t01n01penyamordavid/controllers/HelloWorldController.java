package cat.itacademy.barcelonactiva.penyamor.david.s04.t01.n01.s04t01n01penyamordavid.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    
    @GetMapping("/HelloWorld")
    @ResponseBody
    public String greet(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name)
    {
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }

    @GetMapping({"/HelloWorld2","/HelloWorld2/{name}"})
    @ResponseBody
    public String greet2(@PathVariable(required = false) String name)
    {
        if(name == null)
            name = "UNKNOWN";
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }
}
