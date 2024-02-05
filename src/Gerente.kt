

class Gerente (nombre: String, edad: Int, salarioBase: Double, override val porcentajeImpuesto: Double = 33.99, private val bonus: Double, var exentoImpuestos: Boolean = false): Empleado(nombre, edad, salarioBase, porcentajeImpuesto) {
    override fun calcularSalario(): Double {
        if (exentoImpuestos == true) {
            return salarioBase + bonus
        } else {
            return super.calcularSalario() + bonus
        }
        override fun toString(): String {
            return super.toString()
        }

    }
}