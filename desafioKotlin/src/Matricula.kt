import java.time.LocalDateTime

class Matricula(
        val aluno: Aluno,
        val curso: Curso,
        val dataDeMatricula: LocalDateTime? = LocalDateTime.now(),
) {
    override fun toString(): String {
        return "Aluno = $aluno\n Curso = $curso\n dataDeMatricula = $dataDeMatricula\n"
    }
}