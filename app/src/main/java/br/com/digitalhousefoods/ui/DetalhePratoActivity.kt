package br.com.digitalhousefoods.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import br.com.digitalhousefoods.R
import br.com.digitalhousefoods.domain.Prato
import br.com.digitalhousefoods.domain.PratoAdapter
import br.com.digitalhousefoods.domain.Restaurante
import kotlinx.android.synthetic.main.activity_detalhe_restaurante.*
import kotlinx.android.synthetic.main.activity_prato_detalhe.*

class DetalhePratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato_detalhe)

        val prato = intent.getSerializableExtra("prato") as Prato

        ivDetalhePratoImagem.setImageResource(prato.imagem)
        tvPratoNome.text = prato.nome
        tvPratoDescricao.text = prato.descricao

        toolbarDetalhePrato.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}