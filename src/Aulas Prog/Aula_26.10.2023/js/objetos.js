const turma = {
    turma: '1SIPH',
    campus: 'Paulista',
    sala: 705,
    curso: 'SI'
};

// array de objetos 
const alunos = [
    {nome: 'Israel', turma: '1SIPH', curso: 'SI'},
    {nome: 'Nick', turma: '1SIPI', curso: 'SI'},
    {nome: 'Edu', turma: '1SIS', curso: 'SI'},
    {nome: 'Mateus', turma: '1SIPH', curso: 'SI'}
];
console.log(alunos);

const estudantes = document.querySelector('#objetos');

alunos.forEach(aluno => {
    estudantes.innerHTML += `
        <h2>Aluno: ${aluno.nome}</h2>
        <h3>Aluno: ${aluno.turma}</h3>
        <h4>Aluno: ${aluno.curso}</h4>
        <hr>
    `
});