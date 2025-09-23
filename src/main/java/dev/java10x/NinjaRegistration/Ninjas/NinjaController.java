package dev.java10x.NinjaRegistration.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is my first message on this route.";
    }

    @PostMapping("/create")
    public String createNinja() {
        return "Ninja Created";
    }

    @GetMapping("/all")
    public String showAllNinjas() {
        return "Show all ninjas";
    }

    @GetMapping("allId")
    public String showNinjaById() {
        return "Show ninja by ID";
    }

    @PutMapping("update")
    public String updateNinjaById() {
        return "Update ninja by ID";
    }

    @DeleteMapping("deleteNinja")
    public String deleteNinjaById() {
        return "Delete ninja by ID";
    }
}
