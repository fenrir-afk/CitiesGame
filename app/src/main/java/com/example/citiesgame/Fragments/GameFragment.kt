package com.example.citiesgame.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.citiesgame.databinding.FragmentGameBinding
import com.example.citiesgame.databinding.FragmentHomeBinding
import org.jsoup.Jsoup

class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(inflater,container,false)

        return binding.root
    }

    fun checkCity(city: String?): Int {
       return 1
    }


}