 // Mesmo estando após o código o próprio interpretador sobe este para o inicio do código na hora da interpretação

 // var numberOne;

// let numberOne; // Deve ser declarado antes de utilizar.

// numberOne = 1; // Atribuição

// console.log(numberOne + 2);

// ---------------------------------------------------------------------------------------------------------- // 


// Variaveis Globais e de escopo // 

var fistName = 'João'; // escopo global
let lastName = 'Souza'; // escopo global

if(fistName === 'João'){

    let lastName = 'Rodrigues'; // escopo de bloco
    var fistName = 'Pedro'; // altera o contéudo global
    lastName = 'Silva'; // reatribuição

    console.log(fistName, lastName);  // Pedro Silva

}

console.log(fistName, lastName); // Pedro Souza


const FIRST_NAME = "Mateus"; // Não pode ser reatibuída e nem redeclarada e não faz hoisting -> SNAKE_UPPER_CASE.

console.log(FIRST_NAME);
