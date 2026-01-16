package uce_edu_web.api.matricula.aplication;

 
import java.util.List;
 
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce_edu_web.api.matricula.domain.Estudiante;
import uce_edu_web.api.matricula.infraestructure.EstudianteRepository;;
 
@ApplicationScoped
public class EstudianteServi {
 
    @Inject
    private EstudianteRepository estudianteRepository;
 
    public List<Estudiante> listarTodos() {
        return this.estudianteRepository.listAll();
    }
}
 
 
