package cl.jpvs.modulo5sprintfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

import cl.jpvs.modulo5sprintfinal.databinding.FragmentZapatillaListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ZapatillaListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ZapatillaListFragment : Fragment(), Adapter.ZapatillaCallBack {
    private lateinit var binding: FragmentZapatillaListBinding

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentZapatillaListBinding.inflate(LayoutInflater.from(activity))
        initAdapter()
        return (binding.root)

    }

    private fun initAdapter() {

        val adapter = Adapter()
        val listaZapatillas = zapatillasTienda.getZapatillas()
        adapter.setData(listaZapatillas)
        adapter.callback = this
        binding.recyclerViewListado.adapter = adapter
        binding.faBtnCarrito.setOnClickListener {
            findNavController().navigate(R.id.action_zapatillaListFragment_to_fragCarritoCompras)

        }

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ZapatillaListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

 override fun showZapatillas(zapatilla: Zapatilla)  {
     val bundle = Bundle()
     bundle.putString("nombre", zapatilla.nombre)
     bundle.putString("zImagenUrl", zapatilla.zImagenUrl)
     bundle.putString("precio", zapatilla.precio.toString())
 }
}


//