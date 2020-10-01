/*Classe Main para testar as funcionalidades do desafio kotlin*/

fun main() {

    val manager = DigitalHouseManager()

    //criar cursos
    manager.registrarCurso("C++",23,5)
    manager.registrarCurso("Java",24,3)
    manager.registrarCurso("Android",25,15)

    //criar professores
    manager.registrarProfessorTitular("Lucas","gabriel",10,"C++")
    manager.registrarProfessorAdjunto("Felipe","Medeiros",100,30)
    manager.registrarProfessorTitular("Alan","Turing",11,"Android")
    manager.registrarProfessorAdjunto("José","Renan",101,10)

    //criar alunos
    manager.matricularAluno("José","Damasceno",10)
    manager.matricularAluno("Fulano","De tal",11)
    manager.matricularAluno("José ","Desconhecido",12)
    manager.matricularAluno("Cristiano", "Ronaldo",13)


    //imprimo as listas
//    println(manager.listaDeAluno)
//    println(manager.listaDeCurso)
//    println(manager.listaDeProfessor)

    //manager.excluirProfessor(10)
    //manager.excluirCurso(23)


    //matricular alunos no curso por codigo
    manager.matricularAluno(10,23)
    manager.matricularAluno(11,25)
    manager.matricularAluno(12,24)
    manager.matricularAluno(13,23)


    //associar professor ao curso
    manager.alocarProfessores(23,10,100)
    manager.alocarProfessores(24,11,101)
    manager.alocarProfessores(25,11,101)

    //parte final do programa onde mostro todos os dados de alunos e professores matriculados em seus respectivos cursos
    println(manager.listaDeCurso)

    //aqui foi só um teste para ver dados de data da matricula
    //println(manager.listadeMatricula)

}