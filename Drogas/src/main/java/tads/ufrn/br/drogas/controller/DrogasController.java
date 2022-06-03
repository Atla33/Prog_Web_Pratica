package tads.ufrn.br.drogas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import tads.ufrn.br.drogas.domain.Drogas;
import tads.ufrn.br.drogas.service.DrogasService;

@Controller
public class DrogasController {

    private DrogasService service;

    public DrogasController(DrogasService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/cadastra")
    public String doCadastra(Model model){
        Drogas d = new Drogas();
        return "cadastra";
    }

    @PostMapping("/salvar")
    public String doSalvar(@ModelAttribute Drogas drogas){
        service.insert(drogas);
        return "redirect:/";
    }

}
