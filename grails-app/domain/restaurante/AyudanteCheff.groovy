package restaurante

class AyudanteCheff {
    BigDecimal salario

    static belongsTo = [empleado: Empleado, cheff:Cheff]
    static constraints = {
    }
}
