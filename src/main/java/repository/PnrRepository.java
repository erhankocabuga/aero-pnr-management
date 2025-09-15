package repository;

import entity.Pnr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PnrRepository extends JpaRepository<Pnr, Long> {
}
