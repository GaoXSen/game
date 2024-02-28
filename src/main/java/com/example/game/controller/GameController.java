package com.example.game.controller;

/**
 * @author gaosen
 * @since 2024/2/27 9:28
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game")
public class GameController {

    @GetMapping("/2048")
    public String home() {
        return "2048game"; // 返回Thymeleaf模板的名称，这里对应index.html
    }

}
