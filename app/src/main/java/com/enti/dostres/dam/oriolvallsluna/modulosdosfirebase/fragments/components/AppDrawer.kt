package com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.fragments.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.R
import com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.fragments.screens.LoginScreen
import com.google.android.material.navigation.NavigationView

class AppDrawer: Fragment() {
    lateinit var  fragmentView: View
    lateinit var drawer: DrawerLayout
    lateinit var  navigationDrawer: NavigationView

    companion object{
        private lateinit var  Instance: AppDrawer

        fun get() = Instance
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Instance = this
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentView = inflater.inflate(R.layout.component_navigationdrawer, container, false)
        drawer = fragmentView.findViewById(R.id.AppDrawer)
        drawer = fragmentView.findViewById(R.id.AppDrawer)
        navigationDrawer = fragmentView.findViewById(R.id.navigationDrawer)

        return fragmentView
    }

    fun open(){
        drawer.open()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigationDrawer.setNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId)
            {
                R.id.login_drawer_button -> {

                    val loginScreen = LoginScreen()
                    val transaction = childFragmentManager.beginTransaction()

                    transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right)
                        .replace(R.id.reusableDialogContainer, loginScreen)
                        .addToBackStack(null)
                        .commit()

                    drawer.closeDrawers()
                }
            }

            true
        }
    }
}