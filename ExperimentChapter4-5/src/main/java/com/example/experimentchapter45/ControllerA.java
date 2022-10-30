package com.example.experimentchapter45;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpHeaders;


@RestController
@RequestMapping("/calc")
public class ControllerA
{
    @GetMapping("/sum1")
    public String Solution1(double a,double b)
    {
        double sum=a+b;
        return String.valueOf(sum);
    }
    @GetMapping("/sum2/{a}/{b}")
    public String Solution2(@PathVariable("a") double a,@PathVariable("b") double b)
    {
        double sum=a+b;
        return String.valueOf(sum);
    }
    @GetMapping("/sum31")
    @ResponseBody
    public ModelAndView Solution31()
    {
        return new ModelAndView("a+b");
    }
    @PostMapping("/sum32")
    public String Solution32(@RequestParam("a")double a,@RequestParam("b") double b)
    {
        return String.valueOf(a+b);
    }
}
