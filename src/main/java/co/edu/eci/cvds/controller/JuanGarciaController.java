package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.service.JuanGarciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/JUAN_GARCIA")
public class JuanGarciaController {

    private final JuanGarciaService juangarciaService;

    @Autowired
    public JuanGarciaController(JuanGarciaService juangarciaService) {
        this.juangarciaService = juangarciaService;
    }

    @GetMapping("")
    public String example(Model model) {
        model.addAttribute("juanGarcia", juangarciaService.getAllJuanDavid_GarciaPulido());
        return "DiegoCastellanos";
    }
}
