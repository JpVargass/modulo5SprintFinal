package cl.jpvs.modulo5sprintfinal

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.jpvs.modulo5sprintfinal.databinding.ActivityMainBinding

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
    lateinit var binding : ActivityMainBinding
    private lateinit var mSharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mSharedPreferences = getSharedPreferences("MICarrito", Context.MODE_PRIVATE)
        val binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)


    }

}