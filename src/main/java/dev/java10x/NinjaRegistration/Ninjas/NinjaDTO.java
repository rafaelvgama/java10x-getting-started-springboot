package dev.java10x.NinjaRegistration.Ninjas;

import dev.java10x.NinjaRegistration.Missions.MissionModel;
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
    private String rank;
    private MissionModel mission;
}
