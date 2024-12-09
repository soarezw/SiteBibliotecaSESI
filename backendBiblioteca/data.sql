INSERT INTO tb_tipousuario (nome_usuario) 
VALUES 
    ('Administrador'),
    ('Aluno'),
    ('Bibliotecario');

    INSERT INTO tb_usuario (cpf, email, nome, senha, telefone, tipo_id_tipo)
VALUES 
    ('12345678901', 'admin@exemplo.com', 'Carlos Silva', 'senha123', '11987654321', 1),
    ('23456789012', 'Maria@exemplo.com', 'Maria Oliveira', 'senha321', '11976543210', 2),
    ('34567890123', 'bibliotecario@exemplo.com', 'João Santos', 'senha456', '11876543210', 3),
    ('45678901234', 'Patrícia@exemplo.com', 'Patrícia Lima', 'senha789', '11765432109', 2),
    ('56789012345', 'Rafael@exemplo.com', 'Rafael Costa', 'senha012', '11654321098', 2);

    INSERT INTO tb_livro (isbn, alugado, categoria, descricao, imagem, nome) 
VALUES
    ('9783161484100', 0, 'Ficção Científica', 'Livro sobre viagens espaciais no futuro.', 'livros/ficcao1.jpg', 'Viagem ao Futuro'),
    ('9780743273565', 0, 'Romance', 'História de amor em tempos de guerra.', 'livros/romance1.jpg', 'Amor nas Fronteiras'),
    ('9781861978769', 0, 'Aventura', 'Aventura épica de um herói em busca de um artefato mágico.', 'livros/aventura1.jpg', 'O Guardião do Tesouro'),
    ('9780452284234', 0, 'Mistério', 'Detetive tenta resolver um caso complicado.', 'livros/misterio1.jpg', 'Mistério na Cidade'),
    ('9780374534152', 0, 'Biografia', 'Biografia de um grande líder político.', 'livros/biografia1.jpg', 'Caminhos da Liderança');
