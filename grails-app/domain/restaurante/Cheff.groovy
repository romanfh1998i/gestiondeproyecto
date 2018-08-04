package restaurante

class Cheff {
    BigDecimal salario
    static belongsTo = [empleado: Empleado]
    static constraints = {
    }
}
