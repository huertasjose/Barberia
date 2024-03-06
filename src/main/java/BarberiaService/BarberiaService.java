package BarberiaService;

import com.Barberia.domain.Barberia;
import java.util.List;

public interface BarberiaService {
    
    public List<Barberia> getBarberias(boolean activos);
    
    public Barberia getBarberia(Barberia barberia);

    public void save(Barberia barberia);

    public void delete(Barberia barberia);
    
    
}