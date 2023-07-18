package com.example.meal_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meal_kotlin.databinding.FragmentHomeBinding
import com.example.meal_kotlin.databinding.FragmentMainBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
            return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.findpeople.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_whoFragment)
        }
        binding.findrestaurant.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_findrtFragment)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}