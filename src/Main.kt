fun main(){

    fun Double.redondear(decimales: Int): Double{
        val redondear = "%.${decimales}f".format(this).replace(",",".").toDouble()
        return redondear.toDouble()
    }




    val departamento = Departamento()

    val empleado = EmpleadoFijo(1200.3453478, 12.0, "Daniel",12)
    val empleado2 = EmpleadoFijo(1100.0, 8.0, "Joseico", 11)
    val empleado3 = EmpleadoPorHora(160.0, 5.67, "Miguel", 7)

    departamento.agregarEmpleado(empleado)
    departamento.agregarEmpleado(empleado2)
    departamento.agregarEmpleado(empleado3)

    departamento.mostrarEmpleados()

    println(departamento.calcularSalarioTotalAPagar())

    val dinero = 123.9485948

    println(dinero.redondear(2))
}