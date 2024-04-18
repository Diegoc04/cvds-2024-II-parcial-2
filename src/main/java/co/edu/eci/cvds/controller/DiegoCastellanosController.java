package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.DiegoCastellanos;
import co.edu.eci.cvds.service.DiegoCastellanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/configuration")
public class DiegoCastellanosController {

    private final DiegoCastellanosService diegoCastellanosService;

    @Autowired
    public DiegoCastellanosController(DiegoCastellanosService diegoCastellanosService) {
        this.diegoCastellanosService = diegoCastellanosService;
    }

    @GetMapping("/DiegoCastellanos")
    public String example(Model model) {
        model.addAttribute("premio");
        return "DiegoCastellanos";
    }
}
