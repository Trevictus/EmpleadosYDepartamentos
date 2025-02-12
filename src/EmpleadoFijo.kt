class EmpleadoFijo(val salarioFijo: Double, val numPagas: Double, nombre:String, id: Int): Empleado(nombre, id) {


    override fun calcularSalario(): Double {
        return salarioFijo / numPagas
    }

    override fun toString(): String {
        return super.toString() + " tiene un salario de ${"%.2f".format(calcularSalario())} al mes."
    }
}