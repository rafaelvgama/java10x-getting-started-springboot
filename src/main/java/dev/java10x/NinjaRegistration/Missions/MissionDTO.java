package dev.java10x.NinjaRegistration.Missions;

import dev.java10x.NinjaRegistration.Ninjas.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissionDTO {

    private Long id;
    private String name;
    private String description;
    private List<NinjaModel> ninjas;

}
