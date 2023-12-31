package cl.jpvs.modulo5sprintfinal

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cl.jpvs.modulo5sprintfinal.databinding.FragmentZapatillaDetailBinding
import cl.jpvs.modulo5sprintfinal.databinding.FragmentZapatillaListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [ZapatillaDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ZapatillaDetailFragment : Fragment() {
    private lateinit var binding: FragmentZapatillaDetailBinding
    private lateinit var mSharedPreferences: SharedPreferences
    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("nombre")
            param2 = it.getString("zImagenUrl")
            param3 = it.getString("precio")

        }
    }

    private fun initAdapter() {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mSharedPreferences =
            requireActivity().applicationContext.getSharedPreferences("llave", Context.MODE_PRIVATE)
        binding = FragmentZapatillaDetailBinding.inflate(LayoutInflater.from(activity))
        initAdapter()
        // aqui implememtar agregar al carro con setOnClicLidtener
        return (binding.root)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ZapatillaDetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ZapatillaDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}