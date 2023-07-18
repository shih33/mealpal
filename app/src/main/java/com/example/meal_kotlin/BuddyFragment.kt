package com.example.meal_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meal_kotlin.databinding.FragmentBuddyBinding

class BuddyFragment : Fragment() {
    private var _binding: FragmentBuddyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBuddyBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.myfriendbtn.setOnClickListener{
            findNavController().navigate(R.id.action_buddyFragment_to_friendFragment)
        }
        binding.chinbtn.setOnClickListener{
            findNavController().navigate(R.id.action_buddyFragment_to_personFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}