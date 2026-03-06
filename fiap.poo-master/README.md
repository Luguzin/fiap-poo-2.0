# Projeto POO - Classe Garrafa

##  Descrição

Este projeto representa uma Garrafa do mundo real utilizando os conceitos de Programação Orientada a Objetos (POO).

A classe Garrafa possui atributos que representam suas características e métodos que permitem alterar seu estado de forma controlada.

##  Estrutura da Classe

### Atributos:
- material
- formato
- capacidadeEmMl

Os atributos são privados para proteger o estado do objeto.

##  Métodos Criados

### aumentarCapacidade(int quantidade)

Permite aumentar a capacidade da garrafa.

Regra de negócio:
- Só permite valores maiores que zero.
- Caso contrário, exibe mensagem de erro.

### trocarMaterial(String novoMaterial)

Permite alterar o material da garrafa.

Regra de negócio:
- Não permite valores nulos ou vazios.
- Caso inválido, exibe mensagem de erro.

### exibirInformacoes()

Exibe os dados atuais da garrafa no console.

##  Testes Realizados

Foram realizados testes com:
- Valores válidos
- Valores inválidos

Com isso, garantimos que o objeto não fique em estado inconsistente.

##  Conceitos Aplicados

- Classe
- Objeto
- Instância
- Atributos
- Métodos
- Encapsulamento
- Validação com regras de negócio
