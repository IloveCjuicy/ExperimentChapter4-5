package com.example.experimentchapter45;

import com.example.Model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/c")
public class ControllerC
{
    @GetMapping("/register")
    public String register()
    {
        return "index";
    }
    @PostMapping("/booklist")
    public String booklist(Model model)
    {
        model.addAttribute("bookname","controller初始化名");
        return "index2";
    }
    @GetMapping("/affix")
    public String affix()
    {
        return "index3";
    }
    @PostMapping("/succeed")
    @ResponseBody
    public String succeed(@ModelAttribute("form") Book book)
    {
        return book.toString();
    }
}
