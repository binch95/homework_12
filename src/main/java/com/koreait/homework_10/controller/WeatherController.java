package com.koreait.homework_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class WeatherController {

    @GetMapping("/weather")  // 페이지를 처음 로드할 때
    public String showWeatherPage(Model model) {
        // 초기 데이터가 필요하다면 여기에 추가
        return "weather"; // weather.html을 반환
    }

    @PostMapping("/submitQuestion")
    public String submitQuestion(@RequestParam String question, Model model) {
        // 질문 처리 로직
        return "redirect:/weather"; // 또는 질문이 제출된 후 보여줄 페이지로 이동
    }


}