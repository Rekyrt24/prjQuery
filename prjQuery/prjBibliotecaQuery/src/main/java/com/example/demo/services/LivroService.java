package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Livro;
import com.example.demo.repositories.LivroRepository;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    //construtor que recebe a dependencia
    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro saveLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro getLivroById(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    public void deleteEndereco(Long id) {
    	livroRepository.deleteById(id);
    }
    public List<Livro> buscarPorTitulo(String titulo) {
    	return livroRepository.buscarPorTitulo(titulo);
    }
    public List<Livro> buscarPorAutor(String autor) {
    	return livroRepository.findByAutor(autor);
    }
    public List<Livro> buscarPorEditora(String editora) {
    	return livroRepository.findByEditora(editora);
    }
    public List<Livro> buscarPorNome(String nome) {
    	return livroRepository.findByNome(nome);
    }
    public List<Livro> buscarPorIsbn(String isbn) {
    	return livroRepository.findByIsbn(isbn);
    }
}
