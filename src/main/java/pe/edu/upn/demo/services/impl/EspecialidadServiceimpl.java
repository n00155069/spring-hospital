package pe.edu.upn.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.Especialidad;
import pe.edu.upn.demo.model.repository.EspecialidadRepository;
import pe.edu.upn.demo.service.EspecialidadService;

@Service
public class EspecialidadServiceimpl implements EspecialidadService {

	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Especialidad> findAll() throws Exception {
		return especialidadRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Especialidad> findById(String id) throws Exception {
		return especialidadRepository.findById(id);
	}

	@Transactional
	@Override
	public Especialidad save(Especialidad entity) throws Exception {
		return especialidadRepository.save(entity);
	}

	@Transactional
	@Override
	public Especialidad update(Especialidad entity) throws Exception {
		return especialidadRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		especialidadRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		especialidadRepository.deleteAll();
	}

	
}
