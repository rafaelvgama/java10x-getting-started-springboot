package dev.java10x.NinjaRegistration.Missions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.NinjaRegistration.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "mission")
    @JsonIgnore
    private List<NinjaModel> ninjas;
}
