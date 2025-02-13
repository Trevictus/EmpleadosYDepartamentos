class EmpleadoPorHora(val horasTrabajadas: Double, val tarifaPorHora: Double, nombre:String, id: Int): Empleado(nombre, id) {

    override fun calcularSalario(): Double {
        return horasTrabajadas * tarifaPorHora

    }


}