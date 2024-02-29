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
    public String game_2048() {
        return "2048game"; // 返回Thymeleaf模板的名称，这里对应index.html
    }

    @GetMapping("/2048_2")
    public String game_2048phone() {
        return "2048gamephone"; // 返回Thymeleaf模板的名称，这里对应index.html
    }

    @GetMapping("/fruit")
    public String game_fruit() {
        return "fruitgame"; // 返回Thymeleaf模板的名称，这里对应index.html
    }

}
