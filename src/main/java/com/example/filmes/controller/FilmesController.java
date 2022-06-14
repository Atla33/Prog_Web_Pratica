package com.example.filmes.controller;

import com.example.filmes.domain.Filmes;
import com.example.filmes.service.FilmesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class FilmesController {

    private FilmesService service;

    public FilmesController(FilmesService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @RequestMapping("/cadastrar")
    public String getCadastar(Model model, HttpServletRequest request){

        HttpSession session = request.getSession();
        session.setAttribute("aula", "hello");

        Filmes f = new Filmes();
        model.addAttribute("flilmes", f);
        return "cadastrar";
    }
/*
    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public String doSalvar(@ModelAttribute @Valid Filmes f, Errors errors){

        if(errors.hasErrors()){
            return "cadastrar";
        }else{
            service.create(f);
            return "redirect:/";
        }
    }

 */
}
