package pe.edu.upn.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.Paciente;
import pe.edu.upn.demo.model.repository.PacienteRepository;
import pe.edu.upn.demo.service.PacienteService;

@Service
public class PacienteServiceimpl implements PacienteService{

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Paciente> findAll() throws Exception {
		return pacienteRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Paciente> findById(String id) throws Exception {
		return pacienteRepository.findById(id);
	}

	@Transactional
	@Override
	public Paciente save(Paciente entity) throws Exception {
		return pacienteRepository.save(entity);
	}

	@Transactional
	@Override
	public Paciente update(Paciente entity) throws Exception {
		return pacienteRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		pacienteRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		pacienteRepository.deleteAll();
	}

}
