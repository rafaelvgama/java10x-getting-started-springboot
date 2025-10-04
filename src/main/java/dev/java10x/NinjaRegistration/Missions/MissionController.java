package dev.java10x.NinjaRegistration.Missions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController {

    private final MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<MissionDTO>> getMissions() {
        return ResponseEntity.ok(missionService.getMissions());
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<?> getMission(@PathVariable Long id) {
        MissionDTO existingMission = missionService.getMission(id);
        if (existingMission != null) {
            return ResponseEntity.ok(missionService.getMission(id));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Mission ID " + id + " not found.");
    }

    @PostMapping("/create")
    public ResponseEntity<String> createMission(@RequestBody MissionDTO mission) {
        MissionDTO newMission = missionService.createMission(mission);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Mission successfully created: Name: " + newMission.getName() + " ID: " + newMission.getId());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateMission(@PathVariable Long id, @RequestBody MissionDTO mission) {
        MissionDTO existingMission = missionService.getMission(id);
        if (existingMission != null) {
            return ResponseEntity.ok(missionService.updateMission(id, mission));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Mission ID " + id + " not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMission(@PathVariable Long id) {
        MissionDTO existingMission = missionService.getMission(id);
        if (existingMission != null) {
            missionService.deleteMission(id);
            return ResponseEntity.ok("Mission ID " + id + " successfully deleted");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Mission ID " + id + " not found.");

    }
}
