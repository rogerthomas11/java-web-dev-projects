package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping("")
    @ResponseBody
    public String skillTracker() {
        String html = "<h1>Skills Tracker</h1>" +
                      "<h2>These are my programming skills that I'd like to learn</h2>" +
                      "<ol>" +
                      "<li>Java</li>" +
                      "<li>JavaScript</li>" +
                      "<li>SQL</li>" +
                      "</ol>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        String html = "<form method= 'post'>" +
                    "Name:<br>" +
                    "<input type = 'text' name = 'name' />" +
                    "<br>My favorite language:<br>" +
                    "<select name = firstChoice>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'SQL'>SQL</option>" +
                    "</select>" +
                    "<br>My second favorite language:<br>" +
                    "<select name = secondChoice>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'SQL'>SQL</option>" +
                    "</select>" +
                    "<br>My third favorite language:<br>" +
                    "<select name = thirdChoice>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'SQL'>SQL</option>" +
                    "</select><br>" +
                    "<input type = 'submit' value = 'Submit' />" +
                    "</form>";

        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String mySkillsPage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol";
        return html;
    }
}
