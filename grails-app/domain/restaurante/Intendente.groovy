package restaurante

class Intendente {
    BigDecimal salario
    static belongsTo = [empleado: Empleado]
    static constraints = {
    }
}
