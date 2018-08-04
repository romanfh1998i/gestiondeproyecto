package restaurante

class Factura {
    Date fecha
    BigDecimal total

    static hasOne = [cliente:Cliente]
    static hasMany = [cuenta:Cuenta, cobro:Cobro, pagos:Pago]
    static constraints = {
    }
}
