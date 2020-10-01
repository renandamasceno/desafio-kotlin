class Aluno(
        val nome: String,
        val sobrenome: String,
        val codigoAluno: Int,
) {
    override fun toString(): String {
        return "\n Aluno : $nome $sobrenome codigoAluno = $codigoAluno"
    }


}