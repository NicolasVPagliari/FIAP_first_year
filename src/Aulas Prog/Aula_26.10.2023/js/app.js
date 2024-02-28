// recuperando tbody da página
const tbody = document.querySelector('tbody');
console.log(tbody);

// recuperar o formulario
const form = document.querySelector('form');
console.log(form);

// atribuir ao formulario um evento listener para submit
// passaremos o submit para dentro da função
form.addEventListener('submit', (e) =>{
    // cancelaremos o envio do form
    e.preventDefault();

    // pegar os campos do form e passar para um array
    const campos = [
        form.querySelector('#usuario'),
        form.querySelector('#email'),
        form.querySelector('#dataCadastro'),
        form.querySelector('#tipoConta')
    ];

    // criar uma tr
    const tr = document.createElement('tr');

    // montar um for each para percorrer o array de campos
    campos.forEach(campo => {
        // criar uma td para receber a informação 
        const td = document.createElement('td');

        // colocar o conteúdo do form no textContent da td
        // form não tem textContent - ele tem value
        td.textContent =campo.value;

        // colocar td na tr
        tr.appendChild(td);
    });

    // colocando a tbody no tr
    tbody.appendChild(tr);

    // limpar o formulario
    form.reset();
});




