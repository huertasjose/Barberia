package com.Barberia.Controller;

import BarberiaService.BarberiaService;
import ch.qos.logback.core.model.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/barberia")
public class BarberiaController {
    
      @GetMapping("/menu")
    public String inicio(Model model) {
        return "barberia/menu";
    }

    @GetMapping("/registrarme")
    public String registrarme(Model model) {
        return "registrarme/registrarme";
    }
    @GetMapping("/index")
    public String inicioSesion(Model model) {
        return "/index";
    }
    @GetMapping("/perfil")
public String mostrarPerfil(Model model) {
    return "barberia/perfil";
}
 @GetMapping("/agendar")
    public String mostrarAgenda() {
        return "barberia/agendar"; 
    }
    
    @GetMapping("/lugar")
    public String mostrarLugar() {
        return "barberia/lugar"; 
    }
    @GetMapping("/hora")
    public String mostrarHora() {
        return "barberia/hora"; 
    }
    @GetMapping("/confirmar")
    public String mostrarConfirmar() {
        return "barberia/confirmar"; 
    }
    
}

   