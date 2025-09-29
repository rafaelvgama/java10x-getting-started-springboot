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
    public List<NinjaDTO> listNinjas() {
        return ninjaService.listNinjas();
    }

    @GetMapping("list/{id}")
    public NinjaDTO listNinjaById(@PathVariable Long id) {
        return ninjaService.listNinjaById(id);
    }

    @PostMapping("/create")
    public NinjaDTO createNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.createNinja(ninja);
    }

    @PutMapping("/update/{id}")
    public NinjaDTO updateNinjaById(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        return ninjaService.updateNinja(id, ninja);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNinjaById(@PathVariable Long id) {
        ninjaService.deleteNinjaById(id);
    }
}
