package com.Barberia.service;



import BarberiaService.BarberiaService;
import com.Barberia.domain.Barberia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class BarberiaServiceImpl implements BarberiaService {

    @Override
    public List<Barberia> getBarberias(boolean activos) {
        return null;
    }

    @Override
    public Barberia getBarberia(Barberia barberia) {
        return null;
    }

    @Override
    public void save(Barberia barberia) {
    }

    @Override
    public void delete(Barberia barberia) {
    }
    
}
    
  