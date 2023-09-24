package com.example.citiesgame

import com.example.citiesgame.Fragments.GameFragment
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach

class GameFragmentTest {
    private lateinit var gameFragment: GameFragment
    @Before
    fun setUp() {
        gameFragment = GameFragment()
    }
    @Test
    fun City_is_not_NULL(){
        val city: String? = null
        val city1: String? = "Moscow"
        val res = gameFragment.checkCity(city)
        assertEquals(0,res)
        val res1 = gameFragment.checkCity(city1)
        assertEquals(1,res1)
    }

}