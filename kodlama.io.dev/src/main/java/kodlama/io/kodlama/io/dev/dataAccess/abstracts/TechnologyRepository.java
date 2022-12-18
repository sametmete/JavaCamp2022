package kodlama.io.kodlama.io.dev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kodlama.io.dev.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}
