package restaurante

class Mesero {
    BigDecimal salario

    static belongsTo = [empleado: Empleado]
    static hasMany = [mesa: Mesa]

    static constraints = {
    }
}
