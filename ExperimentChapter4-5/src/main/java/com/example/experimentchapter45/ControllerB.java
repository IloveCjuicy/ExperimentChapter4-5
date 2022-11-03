package com.example.experimentchapter45;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@SessionAttributes(value = {"user-name"},types = {Integer.class})
public class ControllerB
{
    @GetMapping("/set-cookie")
    public String setCookie(HttpServletResponse response)
    {
        Cookie cookie = new Cookie("new-cookie","bupt-1234");
        cookie.setPath("/");
        response.addCookie(cookie);
        return "ok";
    }
    @GetMapping("/get-cookie")
    public String getCookie(@CookieValue(value = "new-cookie",required = false)String cv)
    {
        return cv;
    }
    @GetMapping("/set-session")
    public String setSession(HttpSession session)
    {
        session.setAttribute("user-name","tom");
        return "session set";
    }
    @GetMapping("/get-session")
    public String getSession(@SessionAttribute(name = "user-name",required = false)String un)
    {
        return un;
    }
    @GetMapping("/acc")
    public String acc(Map<String,Integer> map,int number)
    {
        if (!(map.containsKey("names"))) {
            map.put("names",0);
        }
        else {
            map.put("names",map.get("names")+number);
        }
        return map.get("names").toString();
    }
}
