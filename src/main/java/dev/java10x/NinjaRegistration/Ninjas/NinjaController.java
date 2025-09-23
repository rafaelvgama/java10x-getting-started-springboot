package dev.java10x.NinjaRegistration.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is my first message on this route.";
    }

    @GetMapping("/list")
    public String showAllNinjas() {
        return "Ninjas list";
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
