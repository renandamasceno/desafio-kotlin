class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoDeCasa: Int,
        val horasMonitoria: Int,
) : Professor(nome, sobrenome, codigoProfessor, tempoDeCasa) {
    override fun toString(): String {
        return "$nome $sobrenome \n"
    }
}