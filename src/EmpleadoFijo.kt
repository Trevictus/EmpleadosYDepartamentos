class EmpleadoFijo(val salarioFijo: Double, val numPagas: Double, nombre:String, id: Int): Empleado(nombre, id) {


    override fun calcularSalario(): Double {
        return salarioFijo / numPagas
    }


}