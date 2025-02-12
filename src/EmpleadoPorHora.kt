class EmpleadoPorHora(val horasTrabajadas: Double, val tarifaPorHora: Double, nombre:String, id: Int): Empleado(nombre, id) {

    override fun calcularSalario(): Double {
        return horasTrabajadas * tarifaPorHora

    }

    override fun toString(): String {
        return super.toString() + " tiene un salario de ${"%.2f".format(calcularSalario())} al mes."
    }
}