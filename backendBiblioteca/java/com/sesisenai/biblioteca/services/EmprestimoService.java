package com.sesisenai.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesisenai.biblioteca.entity.emprestimo;
import com.sesisenai.biblioteca.repositories.EmprestimoRepository;

import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public List<emprestimo> listarTodosEmprestimos() {
        return emprestimoRepository.findAll();
    }
}

