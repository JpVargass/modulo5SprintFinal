package cl.jpvs.modulo5sprintfinal

data class zapatilla(val nombre: String, val zImagenUrl : String,val precio : Double)
class zapatillasTienda {
    companion object {
        val zapatillas = mutableListOf<zapatilla>().apply {
            add(zapatilla("Rebound joy low zapatilla urbana hombre azul Puma","https://falabella.scene7.com/is/image/Falabella/50196585_1?wid=800&hei=800&qlt=70", 32990.0))
            add(zapatilla("Zapatilla Urbana Hombre Negro Americanino","https://falabella.scene7.com/is/image/Falabella/882678371_4?wid=800&hei=800&qlt=70", 14990.0))
            add(zapatilla("Zapatilla Urbana Hombre Negro Newport","https://falabella.scene7.com/is/image/Falabella/882678362_3?wid=800&hei=800&qlt=70", 11990.0))
            add(zapatilla("Zapatilla Urbana Hombre Azul Newport","https://falabella.scene7.com/is/image/Falabella/882678305_4?wid=800&hei=800&qlt=70", 11990.0))
            add(zapatilla("Zapatilla Hombre Predict Soc3 Negro Salomon","https://falabella.scene7.com/is/image/Falabella/gsc_118344932_2065763_1?wid=800&hei=800&qlt=70", 71990.0))
            add(zapatilla("Zapatilla Hombre Outrise Gris Salomon","https://falabella.scene7.com/is/image/Falabella/gsc_118374745_2065727_1?wid=800&hei=800&qlt=70", 79990.0))
            add(zapatilla("Crater Remixa Zapatilla Urbana Hombre Negro Nike","https://falabella.scene7.com/is/image/Falabella/15313536_01?wid=800&hei=800&qlt=70", 34990.0))
            add(zapatilla("Run 60S 3.0 Zapatilla Urbana Hombre Azul Adidas","https://falabella.scene7.com/is/image/Falabella/50182928_3?wid=800&hei=800&qlt=70", 59990.0))
            add(zapatilla("Puma Zapatilla urbana hombre blanco","https://falabella.scene7.com/is/image/Falabella/15335576_1?wid=800&hei=800&qlt=70", 54990.0))
            add(zapatilla("Puma Zapatilla Puma Rebound Joy Multicolor Zapatilla Urbana Hombre Azul","https://falabella.scene7.com/is/image/Falabella/50251171_1?wid=800&hei=800&qlt=70", 59990.0))
            add(zapatilla("Mountain gear Plomozapatilla outdoor hombre negro","https://falabella.scene7.com/is/image/Falabella/882430309_4?wid=800&hei=800&qlt=70", 19990.0))
            add(zapatilla("Gel-Quantum 90 Zapatilla Urbana Hombre Negra Asics Asics","https://falabella.scene7.com/is/image/Falabella/50168978_1?wid=800&hei=800&qlt=70", 69990.0))

        }
    }
}