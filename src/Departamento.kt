class Departamento {

    val listaEmpleados = mutableListOf<Empleado>()

    fun calcularSalarioTotalAPagar():String{
        var salarioTotal = 0.0
        for(empleado in listaEmpleados){
            salarioTotal += empleado.calcularSalario()
        }
        return "$salarioTotal se debe pagar en total a los trabajadores."
    }

    fun agregarEmpleado(empleado: Empleado){
        listaEmpleados.add(empleado)

    }

    fun mostrarEmpleados(){
        for(empleado in listaEmpleados){
            println(empleado)
        }
    }
}