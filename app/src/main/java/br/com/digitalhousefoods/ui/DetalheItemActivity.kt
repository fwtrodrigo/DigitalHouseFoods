package br.com.digitalhousefoods.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import br.com.digitalhousefoods.R
import br.com.digitalhousefoods.contract.OnClickItemListener
import br.com.digitalhousefoods.domain.Prato
import br.com.digitalhousefoods.domain.PratoAdapter
import br.com.digitalhousefoods.domain.Restaurante
import kotlinx.android.synthetic.main.activity_detalhe_item.*

class DetalheItemActivity : AppCompatActivity(), OnClickItemListener {

    private lateinit var pratos: ArrayList<Prato>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_item)

        val restaurante = intent.getSerializableExtra("restaurante") as Restaurante
        pratos = restaurante.pratos
        val adapter = PratoAdapter(pratos, this)

        ivRestauranteMenuImagem.setImageResource(restaurante.imagem)
        tvRestauranteMenuNome.text = restaurante.nome
        rvRestauranteItem.adapter = adapter
        rvRestauranteItem.layoutManager = GridLayoutManager(this, 2)

    }

    override fun OnClickItem(position: Int) {
        val prato = pratos[position]

        Toast.makeText(this, prato.nome, Toast.LENGTH_SHORT).show()
    }
}