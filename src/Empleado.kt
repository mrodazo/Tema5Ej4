open class Empleado (nombre: String, edad: Int, val salarioBase: Double = 0.0, open val porcentajeImpuesto: Double =
    10.0) : Persona (nombre, edad){

    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuesto: Int) : this(nombre, edad,
        salarioBase.toDouble(), porcentajeImpuesto.toDouble())

    constructor(nombre: String, edad: Int, salarioBase: Int) : this(nombre, edad,
        salarioBase.toDouble())

    open fun calcularSalario() = salarioBase - (salarioBase * (porcentajeImpuesto/100))


    override fun toString() = (super.toString() + "salario: ${"%.2f".format(calcularSalario())}")


    fun trabajar() = "$nombre está trabajando en la empresa"

}