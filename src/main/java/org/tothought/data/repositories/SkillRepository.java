package org.tothought.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tothought.data.entities.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
