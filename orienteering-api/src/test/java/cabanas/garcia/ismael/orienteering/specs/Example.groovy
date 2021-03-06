package cabanas.garcia.ismael.orienteering.specs

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by Ismael on 04/04/2016.
 */
class Example extends Specification{
    def message = "Hola mundo!"

    def obj1 = new Object()

    @Shared
    def obj2 = new Object()

    def "first feature method"(){

        println("Primer método de la feature")
        println("Objeto obj1: " + obj1.toString())
        println("Objeto obj2: " + obj2.toString())

        when: "Mensaje se transforma en minúsculas"
        message = message.toLowerCase()

        then: "El mensaje se debería haber transformado en minúsculas"
        message == "hola mundo!"

    }

    def "second feature method"(){

        println("Segundo método de la feature")
        println("Objeto obj1: " + obj1.toString())
        println("Objeto obj2: " + obj2.toString())

        when: "Mensaje se transforma en mayúsculas"
        message = message.toUpperCase()

        then: "El mensaje se debería haber transformado en mayúsculas"
        message == "HOLA MUNDO!"

    }
}
