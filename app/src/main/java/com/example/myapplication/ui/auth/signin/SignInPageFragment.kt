package com.example.myapplication.ui.auth.signin

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSigninBinding
import com.example.myapplication.ui.main.MainScreenFragment

class SignInPageFragment : Fragment() {

    private var _binding: FragmentSigninBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val loginViewModel =
            ViewModelProvider(this)[SignInPageViewModel::class.java]

        _binding = FragmentSigninBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val textView: TextView = binding.textSignin
        loginViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        clickToMainScreen()
        clickToLogIn()
        return root
    }

    private fun clickToLogIn() {
        binding.logInBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signInPageFragment_to_loginFragment)
        }
    }

    private fun clickToMainScreen() {
        binding.signInBtn.setOnClickListener {
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}