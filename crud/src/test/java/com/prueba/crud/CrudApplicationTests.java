package com.prueba.crud;

import com.prueba.crud.model.Alumno;
import com.prueba.crud.repository.AlumnoRepository;
import com.prueba.crud.service.AlumnoServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CrudApplicationTests {
	@Mock
	private AlumnoRepository alumnoRepository;

	@InjectMocks
	private AlumnoServiceImpl alumnoService;

	@Test
	public void testNewAlumno() {
		Alumno alumno = new Alumno();
		alumno.setNumDocumento(152L);
		alumno.setNombre("leonami");
		alumno.setApellido("de Leon");
		alumno.setCorreoElectronico("leonami@example.com");

		when(alumnoRepository.save(alumno)).thenReturn(alumno);

		Alumno result = alumnoService.newAlumno(alumno);

		verify(alumnoRepository).save(alumno);
		assertEquals(alumno, result);
	}

}
