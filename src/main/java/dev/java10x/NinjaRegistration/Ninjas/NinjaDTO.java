package dev.java10x.NinjaRegistration.Ninjas;

import dev.java10x.NinjaRegistration.Missions.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaDTO {

    private Long id;
    private String name;
    private String email;
    private String imgUrl;
    private int age;
    private String Rank;
    private MissionModel mission;
}
