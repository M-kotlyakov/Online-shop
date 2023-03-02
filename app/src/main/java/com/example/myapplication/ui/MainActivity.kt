package com.example.myapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var navController: NavController? = null

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding ?: throw RuntimeException("ActivityMainBinding == null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomBarNavigation()
    }

//    private fun setupLoginNavigation() {
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
//        navController = navHostFragment.navController
//
////        navController?.navigate(R.id.signInPageFragment)
//    }

    private fun setupBottomBarNavigation() {
        binding.navView.apply {
            navController = (
                supportFragmentManager
                    .findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
                ).navController
            setupWithNavController(this, navController!!)
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
