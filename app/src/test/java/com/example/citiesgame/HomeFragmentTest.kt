package com.example.citiesgame

import com.example.citiesgame.Fragments.HomeFragment
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class HomeFragmentTest {
    private lateinit var homeFragment: HomeFragment
    @Before
    fun setUp() {
        homeFragment = HomeFragment()
    }
    @Test
    fun add_noNull_names(){
        val name1:String? = null
        val name2:String? = null
        val res = homeFragment.checkNames(name1,name2)
        assertEquals(1,res)
    }
    @Test
    fun add_noNumber_names(){
        val name1:String? = "Stepan11"
        val name2:String? = "Bob16"
        val res = homeFragment.checkNames(name1,name2)
        assertEquals(1,res)
    }

}