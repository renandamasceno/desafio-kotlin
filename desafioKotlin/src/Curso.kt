class Curso(
        val nomeDoCurso: String,
        val codigoDoCurso: Int,
        val quantidadeMaxAlunos: Int,
        var alunosMatriculados: MutableList<Aluno> = mutableListOf(),
) {
    var professorTitular: ProfessorTitular?
    var professorAdjunto: ProfessorAdjunto?

    init {
        professorTitular = null
        professorAdjunto = null
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean {
        if (alunosMatriculados.size < quantidadeMaxAlunos) {
            alunosMatriculados.add(aluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno) {
        alunosMatriculados.remove(umAluno)
    }

    override fun toString(): String {
        return "\nNomeDoCurso='$nomeDoCurso' \nProfessor Titular: ${professorTitular} \nProfessor Adjunto: ${professorAdjunto} \ncodigoDoCurso=$codigoDoCurso \nquantidadeMaxAlunos=$quantidadeMaxAlunos \nLista de Matriculados: $alunosMatriculados\n"
    }


}