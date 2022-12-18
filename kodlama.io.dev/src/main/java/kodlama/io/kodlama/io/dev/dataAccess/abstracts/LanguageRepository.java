package kodlama.io.kodlama.io.dev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kodlama.io.dev.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {


}
