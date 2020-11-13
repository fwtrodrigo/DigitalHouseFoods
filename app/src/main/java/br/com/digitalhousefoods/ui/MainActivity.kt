package br.com.digitalhousefoods.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.digitalhousefoods.R
import br.com.digitalhousefoods.Utils.FakeData
import br.com.digitalhousefoods.contract.OnClickRestauranteListener
import br.com.digitalhousefoods.domain.Prato
import br.com.digitalhousefoods.domain.Restaurante
import br.com.digitalhousefoods.domain.RestauranteAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnClickRestauranteListener {

    private val restaurantes = FakeData().obterRestaurantes()
    private val adapter = RestauranteAdapter(restaurantes, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRestaurantesLista.adapter = adapter
        rvRestaurantesLista.layoutManager = LinearLayoutManager(this)
        rvRestaurantesLista.setHasFixedSize(true)
    }

    override fun OnClickRestaurante(position: Int) {
        val restaurante = restaurantes[position]
        Toast.makeText(this, restaurante.nome, Toast.LENGTH_SHORT).show()
        adapter.notifyItemChanged(position)

//        val bundle = bundleOf("amount" to restaurante.img, "nome" to restaurante.nome)

//        findNavController().navigate(R.id.action_mainFragment_to_restauranteFragment, bundle)
    }
}

