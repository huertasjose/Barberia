package com.Barberia.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UsuarioController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/perfil")
    public String mostrarPerfil(Model model) {
        String correo = "admino"; 

        String sql = "SELECT * FROM usuarios WHERE correo = ?";
        Map<String, Object> usuario = jdbcTemplate.queryForMap(sql, correo);

        model.addAttribute("usuario", usuario);
        return "perfil";
    }

    @PostMapping("/login")
    public String login(@RequestParam String correo, @RequestParam String contrasena) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE correo = ? AND contrasena = ?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, correo, contrasena);

        if (count == 1) {
            return "redirect:/perfil";
        } else {
            return "redirect:/error";
        }
    }
}
