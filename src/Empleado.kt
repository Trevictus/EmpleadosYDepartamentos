abstract class Empleado(val nombre: String, val id: Int) {

    abstract fun calcularSalario(): Double

    override fun toString(): String {
        return "$nombre, con ID-${"%04d".format(id)}"
    }
}