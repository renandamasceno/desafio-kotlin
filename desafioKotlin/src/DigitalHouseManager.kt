class DigitalHouseManager(
        val listaDeAluno: MutableList<Aluno> = mutableListOf(),
        val listaDeProfessor: MutableList<Professor> = mutableListOf(),
        val listaDeCurso: MutableList<Curso> = mutableListOf(),
        val listadeMatricula: MutableList<Matricula> = mutableListOf(),
) {
    init {

    }

    fun registrarCurso(
            nome: String,
            codigoCurso: Int,
            quantidadeMaximaDeAluno: Int,
    ) {
        val registroNovoCurso = Curso(nome, codigoCurso, quantidadeMaximaDeAluno)
        listaDeCurso.add(registroNovoCurso)
    }

    fun excluirCurso(codigoCurso: Int) {
        for (i in listaDeCurso) {
            if (codigoCurso == i.codigoDoCurso) {
                listaDeCurso.remove(i)
                break
            }
        }
    }

    fun registrarProfessorAdjunto(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            quantidadeDeHoras: Int,
    ) {
        var newProfessorAdjunto = ProfessorAdjunto(
                nome,
                sobrenome,
                codigoProfessor, 0,
                quantidadeDeHoras)
        listaDeProfessor.add(newProfessorAdjunto)

    }

    fun registrarProfessorTitular(
            nome: String, sobrenome: String,
            codigoProfessor: Int, especialidade: String,
    ) {
        var newProfessorTitular = ProfessorTitular(
                nome,
                sobrenome,
                codigoProfessor,
                0,
                especialidade
        )

        listaDeProfessor.add(newProfessorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (i in listaDeProfessor) {
            if (codigoProfessor == i.codigoProfessor) {
                listaDeProfessor.remove(i)
                break
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        var newAluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAluno.add(newAluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var cursoDesejado = Curso("", 0, 0)
        var alunoParaMAtricua = Aluno("", "", 0)

        for (i in listaDeCurso) {
            if (codigoCurso == i.codigoDoCurso) {
                cursoDesejado = i
            }
        }
        for (i in listaDeAluno) {
            if (codigoAluno == i.codigoAluno) {
                alunoParaMAtricua = i
            }
        }
        if (cursoDesejado.quantidadeMaxAlunos > cursoDesejado.alunosMatriculados.size) {
            cursoDesejado.adicionarUmAluno(alunoParaMAtricua)
            val realizarMatricula = Matricula(alunoParaMAtricua, cursoDesejado)
            listadeMatricula.add(realizarMatricula)
        } else {
            println("Não foi possivel realizar a matrícula pois não havia vagas disponíveis no curso desejado!");
        }
    }


    fun alocarProfessores(
            codigoCurso: Int, codigoProfessorTitular: Int,
            codigoProfessorAdjunto: Int,
    ) {
        var professorTitular: ProfessorTitular? = null
        var professorAdjunto: ProfessorAdjunto? = null

        for (i in listaDeProfessor) {
            if (codigoProfessorTitular == i.codigoProfessor) {
                professorTitular = i as ProfessorTitular
            } else if (i.codigoProfessor == codigoProfessorAdjunto) {
                professorAdjunto = i as ProfessorAdjunto
            }
        }

        for (i in listaDeCurso) {
            if (i.codigoDoCurso == codigoCurso) {
                i.professorTitular = professorTitular
                i.professorAdjunto = professorAdjunto
            }
        }

    }

    override fun toString(): String {
        return "DigitalHouseManager(listaDeAluno=$listaDeAluno, listaDeProfessor=$listaDeProfessor, listaDeCurso=$listaDeCurso, listadeMatricula=$listadeMatricula)"
    }


}