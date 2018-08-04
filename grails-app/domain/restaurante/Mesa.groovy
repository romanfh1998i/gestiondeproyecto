package restaurante

class Mesa {

        String posicion
        boolean estado=true
        int numero
        int capacidad
        int comensales

    static hasMany =[mesero: Mesero, orden: Orden]
    static belongsTo = [cliente:Cliente]

    static constraints = {
        cliente nullable: true
        mesero nullable: true
        orden nullable: true

    }
}
