package com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.fragments.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.R

class AppNavHost: Fragment() {

    companion object{
        lateinit var Instance: AppNavHost
        fun Get() = Instance
    }

    lateinit var  navHost: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Instance = this
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.component_navhost, container, false)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.navigation_host_fragment) as NavHostFragment
        navHost = navHostFragment.navController
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}