# Garagem

### Introdução

O Sr. Steve Harris, um abastado cantor de uma banda famosa, possui uma grande frota de veículos. Dentre seus veículos, destacase: dois iates, um helicóptero, dois carros hiperesportivos e um caminhão preparado para enfrentar um mundo pós-apocalíptico. A casa do Sr. Harris fica a beira de um rio e com seu orçamento ilimitado ele decidiu construir uma instalação às margens deste rio. Um gigantesco galpão onde pudesse guardar com segurança todos os seus veículos. Agora ele deseja contratar um programador para construir um programa que auxilie na gerência de sua frota.

### Exercícios

1. Crie um projeto Orientado a Objeto com o nome `Garage`. Implemente as classes de domínio da aplicação (lembre-se de colocar no pacote correto):
<img 
  width="100%" 
  height="auto" 
  title="Diagrama UML - Exercício 1" 
  alt="Diagrama UML - Exercício 1"
  src="https://github.com/DanielAraldiEDU/garage/assets/100477637/34da7a68-9297-4430-89da-93d1b03bf7b5">

2. Crie a classe `Shed`. A classe `Shed` possui uma agregação com muitos veículos, não importando se esses veículos são terrestres, aéreos ou aquáticos. Perceba que Veiculo é uma interface que especifica um método abstrato que retorna um **texto** contendo todas as informações do veículo. Você deve fazer com que todos os veículos de Steve possam ser inseridos no galpão, sem alterar o tipo do parâmetro do método `addVehicle` na classe `Shed`. Você deverá decidir que alterações precisarão ser realizadas nas classes do Exercício 1 para atender a esse requisito. Atenção, para a solução dessa atividade `não` é necessário utilizar o operador `instanceof` e nem realizar testes condicionais para decidir o tipo de veículo.
<img 
  width="100%" 
  height="auto" 
  title="Diagrama UML - Exercício 2" 
  alt="Diagrama UML - Exercício 2"
  src="https://github.com/DanielAraldiEDU/garage/assets/100477637/fc31e102-6858-4c24-a6c5-ae6f1459c49a">

3. Implemente a interface (gráfica ou texto) do usuário que permita inserir os veículos do Sr. Steve Harris em uma instância da classe `Shed` e que possibilite apresentar a relação de veículos ao usuário.

### Colaboradores

Projeto desenvolvido por [Daniel Sansão Araldi](https://github.com/DanielAraldi). Prova prática M2 da matéria de Programação Orientada a Objetos lecionada pelo incrível mestre supremo Bughi 🤪.
