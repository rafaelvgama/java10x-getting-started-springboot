package dev.java10x.NinjaRegistration.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "This is my first message on this route.";
    }

    @GetMapping("/list")
    public List<NinjaModel> listNinjas() {
        return ninjaService.listNinjas();
    }

    @GetMapping("listID")
    public String showNinjaById() {
        return "Ninja by ID";
    }

    @PostMapping("/create")
    public String createNinja() {
        return "Ninja created";
    }

    @PutMapping("/update")
    public String updateNinjaById() {
        return "Ninja updated";
    }

    @DeleteMapping("/delete")
    public String deleteNinjaById() {
        return "Ninja deleted";
    }
}
