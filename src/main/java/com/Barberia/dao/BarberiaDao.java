
package com.Barberia.dao;

import com.Barberia.domain.Barberia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author huert
 */
public interface BarberiaDao extends JpaRepository <Barberia, Long>{
    
}
