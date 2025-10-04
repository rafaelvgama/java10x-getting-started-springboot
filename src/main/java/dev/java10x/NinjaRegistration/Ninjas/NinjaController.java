package dev.java10x.NinjaRegistration.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<NinjaDTO>> listNinjas() {
        return ResponseEntity.ok(ninjaService.listNinjas());
    }

    @GetMapping("list/{id}")
    public ResponseEntity<?> listNinjaById(@PathVariable Long id) {
        NinjaDTO existingNinja = ninjaService.listNinjaById(id);
        if (existingNinja != null) {
            return ResponseEntity.ok(ninjaService.listNinjaById(id));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja ID " + id + "not found.");
    }

    @PostMapping("/create")
    public ResponseEntity<String> createNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO newNinja = ninjaService.createNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja successfully created: Name: " + newNinja.getName() + ", ID: " + newNinja.getId() + ".");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateNinjaById(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        NinjaDTO existingNinja = ninjaService.listNinjaById(id);
        if (existingNinja != null) {
            return ResponseEntity.ok(ninjaService.updateNinja(id, ninja));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja ID " + id + " not found.");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteNinjaById(@PathVariable Long id) {
        NinjaDTO existingNinja = ninjaService.listNinjaById(id);
        if (existingNinja != null) {
            ninjaService.deleteNinjaById(id);
            return ResponseEntity.ok("Ninja ID " + id + " successfully deleted.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja ID " + id + " not found.");
    }
}
