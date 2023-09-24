package com.example.citiesgame.ViewModel

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach

class GameViewModelTest {
    private lateinit var gameViewModel: GameViewModel
    @Before
    fun setUp() {
        gameViewModel = GameViewModel()
    }
    @Test
    fun City_is_in_List(){
        val city1: String = "Moscow"
        val city2: String = "Saint Petersburg"
        val res = gameViewModel.getResult(city1)
        assertEquals(1,res)
        val res1 = gameViewModel.getResult(city2)
        assertEquals(1,res1)
    }

}