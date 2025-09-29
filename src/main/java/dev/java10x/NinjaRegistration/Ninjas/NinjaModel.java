package dev.java10x.NinjaRegistration.Ninjas;

import dev.java10x.NinjaRegistration.Missions.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninjas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(unique = true, name = "email")
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "age")
    private int age;

    @Column(name = "rank")
    public String rank;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionModel mission;
}
