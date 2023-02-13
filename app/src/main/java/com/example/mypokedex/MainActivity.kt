package com.example.mypokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mypokedex.databinding.ActivityMainBinding
import com.example.mypokedex.pokemon.api.PokemonDataSourceImpl
import com.example.mypokedex.pokemon.data.PokemonRepositoryImpl
import com.example.mypokedex.pokemon.ui.detail.PokemonDetailFragment
import com.example.mypokedex.pokemon.ui.home.PokedexListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        if (savedInstanceState == null) {
//            val fragment = PokemonDetailFragment()
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.pkmn_content, fragment)
//                .commit()
//        }
    //    binding = ActivityMainBinding.inflate(layoutInflater)
    //    setContentView(binding.root)
    //    val adapter = PokedexListAdapter(listOf(""))
    //    binding.rvPokedexList.adapter = adapter
    //    binding.rvPokedexList.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()
//        PokemonRepositoryImpl(PokemonDataSourceImpl()).getPokemon("bulbasaur") { response ->
//            println(response)
//        }
//        PokemonRepositoryImpl(PokemonDataSourceImpl()).getListOfPokemons { result ->
//            println(result)
//            result?.let {
//                (binding.rvPokedexList.adapter as PokedexListAdapter).names = it
//                var adapter = binding.rvPokedexList.adapter
//                adapter?.notifyDataSetChanged()
//            }
//        }
    }
}