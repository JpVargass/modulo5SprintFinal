package cl.jpvs.modulo5sprintfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
*   Shoe Tap
*  Primera Pantalla (Activitys)
* ( ) crear pantalla inicio que muestre lista zapatos
* ( ) Utilizar RecyclerView para mostrar en foma de lista debe incluir imagen y precio
* ( ) Puedes implementar esta pantalla utilizando fragmento en Android Studio
* ( ) los productos deben ser una lista estática local
*
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}