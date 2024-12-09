package com.sesisenai.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesisenai.biblioteca.entity.Livro;
import com.sesisenai.biblioteca.repositories.LivroRepository;

@RestController
@RequestMapping("livro")
public class LivroController {

	@Autowired
	private LivroRepository tb_livro;

	@GetMapping
	public List<Livro> findAll() {
		List<Livro> listaLivro = tb_livro.findAll();
		return listaLivro;
	}

	@GetMapping(value = "/{isbn}")
	public Livro findById(@PathVariable String isbn) {
		return tb_livro.findById(isbn).get();
	}

	@PostMapping
	public Livro insert(@RequestBody Livro obj) {
		return obj = tb_livro.save(obj);

	}
	
/*	@PutMapping("/{id}")
    public Livro atualizarLivro(@PathVariable("id") String isbn,@RequestBody Livro livroAtualizado) {
		Livro livro = tb_livro.findById(isbn).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
		livro.setAlugado(livroAtualizado.isAlugado());
        return tb_livro.save(livro);
    }
*/
	
	@PutMapping("/{isbn}")
	public Livro atualizarLivro(@PathVariable String isbn, @RequestBody Livro livroAtualizado) {
	    Livro livro = tb_livro.findById(isbn).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
	    livro.setAlugado(true); // Alterando o status para 'alugado'
	    return tb_livro.save(livro);
	}

	@DeleteMapping(value = "/{isbn}")
	public void delete(@PathVariable String isbn) {
		tb_livro.deleteById(isbn);
	}

}
