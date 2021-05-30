package com.javatechie.domain.model;

import com.javatechie.core.model.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
@Entity
public class Doctor implements AbstractEntity {

    @Id
    private Integer id;
    private String name;
    private String specialist;
}
