package dev.java10x.NinjaRegistration.Missions;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missions")
public class MissionController {

    @GetMapping("/list")
    public String listMissions() {
        return "Missions list";
    }

    @PostMapping("/create")
    public String createMission() {
        return "Mission created";
    }

    @PutMapping("/update")
    public String updateMission() {
        return "Mission updated";
    }

    @DeleteMapping("/delete")
    public String deleteMission() {
        return "Mission deleted";
    }
}
