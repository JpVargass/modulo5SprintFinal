package cl.jpvs.modulo5sprintfinal


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.jpvs.modulo5sprintfinal.databinding.ItemLayoutBinding
import coil.load

class Adapter : RecyclerView.Adapter <Adapter.ViewHolder>(){
    var zapatillas = mutableListOf<Zapatilla>()
    var callback: ZapatillaCallBack? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return zapatillas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = zapatillas[position]
        holder.bind(item)
    }

    fun setData(zapatillaList: List<Zapatilla>){
        this.zapatillas = zapatillaList.toMutableList()
    }

    inner class ViewHolder(val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {

          fun bind(zapatilla: Zapatilla) {
            binding.textViewDescripcion.text = zapatilla.nombre
            binding.textViewPrecio.text = "$ " + zapatilla.precio.toString()
            binding.imVZapatilla.load(zapatilla.zImagenUrl)
            binding.cardViewZapatilla.setOnClickListener {
                callback?.showZapatillas(zapatilla)
                val applicationContext = this
            }

        }
    }
        interface ZapatillaCallBack {
        fun showZapatillas(zapatilla: Zapatilla)

    }

 }
