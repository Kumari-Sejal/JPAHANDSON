package com.cognizant.ormlearn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.repository.SkillRepositary;

@Service
public class SkillService {
	@Autowired
	private SkillRepositary skillRepositary;
	@Transactional
	public Skill get(int id) {
		Optional<Skill> skills = skillRepositary.findById(id);
		if(!skills.isPresent())
			return null;
		return skills.get();
	}
	@Transactional
	public void save(Skill skill) {
		skillRepositary.save(skill);
	}
}
