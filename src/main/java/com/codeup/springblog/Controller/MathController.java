package com.codeup.springblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MathController {

    @RequestMapping(path= "/addNumber/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int addNum(@PathVariable int number1, @PathVariable int number2){

        return number1 + number2;
    }

    @RequestMapping(path= "/subNumber/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int subNum(@PathVariable int number1, @PathVariable int number2){

        return number1 - number2;
    }


    @RequestMapping(path= "/multiplyNumber/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int multiplyNum(@PathVariable int number1, @PathVariable int number2){

        return number1 * number2;
    }


    @RequestMapping(path= "/divideNumber/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int divideNum(@PathVariable int number1, @PathVariable int number2){

        return number1 / number2;
    }

}
