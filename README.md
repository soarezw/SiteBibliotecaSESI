<a id="readme-top"></a>

# Biblioteca SESI


Discorra em um ou mais parágrafos a descrição do seu projeto.
![inicio](https://github.com/user-attachments/assets/7d5fdd1a-7792-4b43-864f-a77ac8f191aa)
![emprestimo](https://github.com/user-attachments/assets/34f2e81b-9be4-4b8c-b117-10b7e9e50b8d)
![categorias](https://github.com/user-attachments/assets/ce4c365e-6147-4f03-801b-435ea652411b)<br>

## 🚀 Começando

GitHub: Certifique-se de ter o GitHub instalado em sua máquina. Se não tiver, você pode baixá-lo e instalá-lo aqui.

Ambiente de Desenvolvimento: Dependendo do tipo de projeto, você pode precisar de um ambiente específico (ex: Node.js, Python, Java, etc.). Certifique-se de que o ambiente adequado esteja instalado. Verifique a documentação do projeto para detalhes.

### 📋 Pré-requisitos

Aplicação Web
URL de Acesso: 

O acesso é feito por um navegador de internet (Google Chrome, Firefox, Microsoft Edge.)
Você precisará da URL fornecida pelo desenvolvedor ou empresa.

Configurações:
A aplicação web exije login, certifique-se de ter um nome de usuário e senha.
Caso não tenha login, faça o cadastro!
Banco de Dados: Instale e configure um banco de dados como MySQL.
```
Dê exemplos (navegador, framework, biblioteca necessária, tecnologias, etc.)
```

### 🔧 Instalação

Passo 1: Baixar o Repositório
Baixe o repositório desejado, coloque em uma pasta e abra no Editor Executado - Visual Studio Code.

Logo após baixe os arquivos para ter disponibilidade e acesso ao Banco de Dados, usando o MySQL para abrir o código!
```
Dê exemplos.
```

E repita:

```
Até finalizar...
```

Obter Dados do Sistema
Vamos consultar uma lista de usuários disponíveis na API da aplicação.

Requisição:
Use uma ferramenta como Postman, Insomnia, ou o terminal (com curl) para enviar uma requisição GET.

bash
Copiar código
curl -X GET http://localhost:3000/api/users
Resposta Esperada:
O servidor retorna uma lista de usuários cadastrados no sistema:

json
Copiar código
[
  {
    "id": 1,
    "name": "João Silva",
    "email": "joao@example.com"
  },
  {
    "id": 2,
    "name": "Maria Oliveira",
    "email": "maria@example.com"
  }
]

Esses exemplos mostram como consultar e interagir com os dados de um sistema configurado. Isso pode ser estendido para outras ações, como atualizar ou deletar registros, dependendo das funcionalidades disponíveis na aplicação. 🎉

<!-- Note que você pode colocar trechos de código e comandos para cópia aos visitantes. -->

## ⚙️ Executando os testes

1. Garantir que Dependências de Testes Estejam Instaladas
Certifique-se de que as dependências necessárias para os testes estão instaladas. No Node.js, por exemplo, isso geralmente inclui bibliotecas como:

Jest: Um framework de testes.
Supertest: Para testes de endpoints API.
Testing Library: Para testes de interface (caso aplicável).

2. Configurar o Ambiente de Testes
Adicionar Scripts ao package.json:
Verifique se o arquivo package.json contém um script para executar os testes.
Criar um Banco de Dados de Testes (se necessário):
Configure uma base de dados separada para executar os testes.



### 🔩 Analise os testes de ponta a ponta

1. Testes Unitários
Objetivo:
Verificar o funcionamento de funções específicas, como cálculo de atrasos ou formatação de dados.

2. Testes de Integração
Objetivo:
Testar a interação entre diferentes componentes do sistema, como o endpoint que retorna os livros cadastrados no banco de dados.

3. Testes Funcionais
Objetivo:
Testar funcionalidades completas da aplicação, como a busca de livros ou emprestimo de um livro.


```
// Função para calcular multa em loans.js
function calcularMulta(diasAtraso, taxaDiaria) {
  return diasAtraso > 0 ? diasAtraso * taxaDiaria : 0;
}
module.exports = calcularMulta;

// Teste unitário para calcularMulta
const calcularMulta = require('./loans');

describe('Teste da função calcularMulta', () => {
  it('Deve calcular corretamente a multa para 5 dias de atraso com taxa de R$2/dia', () => {
    expect(calcularMulta(5, 2)).toBe(10);
  });

  it('Deve retornar 0 para zero dias de atraso', () => {
    expect(calcularMulta(0, 2)).toBe(0);
  });
});
```
### ⌨️ Testes de codificação (HTML e CSS segundo a W3C, por exemplo)

1. Validação de HTML
  A validação de HTML verifica a conformidade do código com os padrões da W3C, identificando problemas como:
    Tags Malformadas: Abertura e fechamento de tags inconsistentes.
    Atributos Inválidos: Uso de atributos que não são reconhecidos pela especificação.
    Hierarquia Inválida: Elementos em posições incorretas no DOM (exemplo: um <div> dentro de um <p>).
    Ausência de Atributos Obrigatórios: Como o alt em imagens.

2. Validação de CSS
  A validação de CSS garante que as regras de estilo estejam corretas e reconhecidas pelos navegadores. Os problemas verificados incluem:
    Propriedades Inválidas: Uso de propriedades ou valores que não existem ou são obsoletos.
    Sintaxe Incorreta: Erros como ausência de ponto e vírgula no final de uma declaração.
    Seletores Duplicados ou Ineficientes: Regras que podem ser simplificadas ou otimizadas.

IMPORTÂNCIA DESSES TESTES;
  Compatibilidade Entre Navegadores: Sites que seguem os padrões da W3C são mais propensos a funcionar corretamente em diferentes navegadores (Chrome, Firefox, Safari, etc.).

  Acessibilidade: Um HTML semântico e estruturado é mais acessível para leitores de tela, essencial para usuários com deficiências.

  SEO (Otimização para Motores de Busca): Código válido e bem estruturado melhora a indexação nos mecanismos de busca.

  Manutenção e Escalabilidade: Seguir os padrões facilita a leitura e atualização do código por desenvolvedores futuros.

  Desempenho: CSS e HTML otimizados reduzem o tamanho do arquivo e o tempo de carregamento da página.

```
Validação de HTML
Erro Detectado:

html
Copiar código
<img src="capa-livro.jpg">
-----------------------------
Validação de CSS
Erro Detectado:
css
Copiar código
color: #123456
background-color: rgba(255, 255, 255); /* Faltando ponto e vírgula */
```

## 📦 Implantação

Ainda não existe um sistema desse aonde ele será implementado.
## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto. Esta seção deve listar todos os principais framworks/bibliotecas usadas para inicializar seu projeto. Aqui estão alguns exemplos:

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=bootstrap,java,css,figma,github,html,js,mysql,postman,spring,vscode" />
  </a>
</p>


## 📌 Versão

1.0

## ✒️ Autores

Mencione todos aqueles que ajudaram a levantar o projeto desde o seu início

* **Daniel Soares Pesce** - *Front-End/Documentação* - [danielsoarespesce](https://github.com/soarezw)
* **Leticia Martin** - *Front-End/Documentação* - [leticiamartin](https://github.com/13martinlele)
* **Giovanna Cristina** - *Back-End/Documentação* - [giovannacristina](https://github.com/giovannnacruz)
* **Sarah Kristiny** - *Back-End/Documentação* - [sarhakristiny](https://github.com/SarahTheodoro)
  

## 📄 Licença

Este projeto está sob a licença (DANIEL SOARES) - crie um arquivo de nome **LICENSE** no repositório e escolha MIT, a principal licença de distribuição.

## 🎁 Expressões de gratidão

* Este projeto foi feito para ajudar os Alunos e Bibliotercario, como em momentos de emprestimo de livros e devoluções, assim agilizando todo esse processo.📢;
* AGRADECEMOS A TODOS OS ENVOLVIDOS NA PRODUÇÃO DO TRABALHO, E PELA ATENÇÃO! 🫂;


---
![image](https://static.wikia.nocookie.net/saintseya/images/1/10/Corrente_de_Andr%C3%B4meda.gif/revision/latest/scale-to-width-down/202?cb=20150629040018&path-prefix=pt)

⛓️ | <a href="#readme-top">⬆️ Voltar ao topo</a>

