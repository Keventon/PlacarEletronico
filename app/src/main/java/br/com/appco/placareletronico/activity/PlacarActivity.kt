package br.com.appco.placareletronico.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.appco.placareletronico.R
import br.com.appco.placareletronico.databinding.ActivityMainBinding
import br.com.appco.placareletronico.databinding.ActivityPlacarBinding
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class PlacarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlacarBinding
    private var placarTimeA = 0
    private var placarTimeB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlacarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            textPlacarTimeA.text = "$placarTimeA"
            textPlacarTimeB.text = "$placarTimeB"

            textResetarPlacar.setOnClickListener {
                MainScope().launch {
                    resetarPlacar()
                }
            }

            textAddUmPonto.setOnClickListener {
                MainScope().launch {
                    adicionarUmPontoTimeA()
                }
            }

            textReduzirUm.setOnClickListener {
                MainScope().launch {
                    removerUmPontoTimeA()
                }
            }

            textAddDoisPontos.setOnClickListener {
                MainScope().launch {
                    adicionarDoisPontosTimeA()
                }
            }

            textReduzirDois.setOnClickListener {
                MainScope().launch {
                    removerDoisPontosTimeA()
                }
            }

            textAddTresPontos.setOnClickListener {
                MainScope().launch {
                    adicionarTresPontosTimeA()
                }
            }

            textReduzirTres.setOnClickListener {
                MainScope().launch {
                    removerTresPontosTimeA()
                }
            }

            textAddUmPontoTime2.setOnClickListener {
                MainScope().launch {
                    adicionarUmPontoTimeB()
                }
            }

            textReduzirUmTime2.setOnClickListener {
                MainScope().launch {
                    removerUmPontoTimeB()
                }
            }

            textAddDoisPontosTime2.setOnClickListener {
                MainScope().launch {
                    adicionarDoisPontosTimeB()
                }
            }

            textReduzirDoisTime2.setOnClickListener {
                MainScope().launch {
                    removerDoisPontosTimeB()
                }
            }

            textAddTresPontosTime2.setOnClickListener {
                MainScope().launch {
                    adicionarTresPontosTimeB()
                }
            }

            textReduzirTresTime2.setOnClickListener {
                MainScope().launch {
                    removerTresPontosTimeB()
                }
            }
        }
    }

    private fun atualizarPlacar() {
        binding.textPlacarTimeA.text = placarTimeA.toString()
        binding.textPlacarTimeB.text = placarTimeB.toString()
    }

    private fun adicionarUmPontoTimeA() {
        placarTimeA++
        atualizarPlacar()
    }

    private fun removerUmPontoTimeA() {
        if (placarTimeA > 0) {
            placarTimeA--
            atualizarPlacar()
        }
    }

    private fun adicionarDoisPontosTimeA() {
        placarTimeA += 2
        atualizarPlacar()
    }

    private fun removerDoisPontosTimeA() {
        if (placarTimeA > 0) {
            if (placarTimeA == 1) {
                placarTimeA = 0
                atualizarPlacar()
            }else {
                placarTimeA -= 2
                atualizarPlacar()
            }
        }
    }

    private fun adicionarTresPontosTimeA() {
        placarTimeA += 3
        atualizarPlacar()
    }

    private fun removerTresPontosTimeA() {
        if (placarTimeA > 0) {
            if (placarTimeA == 2 || placarTimeA == 1) {
                placarTimeA = 0
                atualizarPlacar()
            }else {
                placarTimeA -= 3
                atualizarPlacar()
            }
        }
    }

    private fun adicionarUmPontoTimeB() {
        placarTimeB++
        atualizarPlacar()
    }

    private fun removerUmPontoTimeB() {
        if (placarTimeB > 0) {
            placarTimeB--
            atualizarPlacar()
        }
    }

    private fun adicionarDoisPontosTimeB() {
        placarTimeB += 2
        atualizarPlacar()
    }

    private fun removerDoisPontosTimeB() {
        if (placarTimeB > 0) {
            if (placarTimeB == 1) {
                placarTimeB = 0
                atualizarPlacar()
            }else {
                placarTimeB -= 2
                atualizarPlacar()
            }
        }
    }

    private fun adicionarTresPontosTimeB() {
        placarTimeB += 3
        atualizarPlacar()
    }

    private fun removerTresPontosTimeB() {
        if (placarTimeB > 0) {
            if (placarTimeB == 2 || placarTimeB == 1) {
                placarTimeB = 0
                atualizarPlacar()
            }else {
                placarTimeB -= 3
                atualizarPlacar()
            }
        }
    }

    private fun resetarPlacar() {
        placarTimeA = 0
        placarTimeB = 0
        atualizarPlacar()
    }
}