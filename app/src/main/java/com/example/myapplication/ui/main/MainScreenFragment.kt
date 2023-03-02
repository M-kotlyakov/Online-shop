package com.example.myapplication.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainScreenBinding

class MainScreenFragment : Fragment() {

    private var navController: NavController? = null

    private var _binding: FragmentMainScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(MainScreenViewModel::class.java)

        _binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        val root: View = binding.root

        homeViewModel.text.observe(viewLifecycleOwner) {
            binding.textViewMain.text = it
        }

//        setupBottomBarNavigation()
        return root
    }

//    private fun setupBottomBarNavigation() {
//        binding.navView.apply {
//            navController = (
//                childFragmentManager
//                    .findFragmentById(R.id.nav_host_fragment_fragment_main) as NavHostFragment
//                ).navController
//            setupWithNavController(this, navController!!)
//        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}