package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SVTech 
{
@RequestMapping("/")
public String hello() 
{
return "This is SV Tech";
}
}
