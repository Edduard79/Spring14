package com.example.Ex14;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Programming Languages Repository"))
public interface ProgrammingLanguageRepo extends JpaRepository<ProgrammingLanguage, Long> {
}
