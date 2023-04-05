package br.com.alura.linguagensapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class LanguageController {
  
  @Autowired
  private LanguageRepository repository;


  @GetMapping("/linguagens")
  public List<Language> getAll(){
    return repository.findByOrderByRanking();
  }

  @GetMapping("/linguagens/{id}")
  public Language busca(@PathVariable String id){
    
    return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

  @PostMapping("/linguagens")
  public ResponseEntity<Language>  createLanguage(@RequestBody Language language){
    
    Language lang = repository.save(language);
    return new ResponseEntity<>(lang, HttpStatus.CREATED);
    
  }

   @PutMapping("/linguagens/{id}")
   public Language updateLanguage(@PathVariable String id, @RequestBody Language language){
    if(!repository.existsById(id)){
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    language.setId(id);
     Language lang = repository.save(language);
     return lang;
  }

  @DeleteMapping("/linguagens/{id}")
  public void deleteLanguage(@PathVariable String id){
    if(!repository.existsById(id)){
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    repository.deleteById(id);
  }


}
