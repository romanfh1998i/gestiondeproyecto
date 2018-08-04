package restaurante

class ApplicationController {

    def index() { }

    def crearMesaPost(String posicion,int numero,int capacidad,int comensales){
        Mesa mesa=new Mesa(posicion: posicion,numero: numero,capacidad: capacidad,comensales: comensales)
        mesa.save()
        redirect(url:"/application/mesas")
    }
}
