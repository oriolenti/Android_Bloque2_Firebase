package com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.fragments.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.R
import com.google.android.material.appbar.MaterialToolbar

class AppToolbar: Fragment() {

    companion object {
        private lateinit var Instance: AppToolbar
        fun Get() = Instance
    }

    lateinit var toolbar: MaterialToolbar

    //Se llama cuando se crea la instancia de la clase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Instance = this
    }

    //Se llama cuando se tiene que crear la vista que se visualiza
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.component_toolbar, container, false)
        toolbar = view.findViewById(R.id.appToolbar)
        return view
    }

    //Se llama cuando las vistas ya están creadas
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}