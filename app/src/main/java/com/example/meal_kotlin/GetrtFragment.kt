package com.example.meal_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meal_kotlin.databinding.FragmentGetrtBinding
import com.example.meal_kotlin.databinding.FragmentMainBinding

class GetrtFragment : Fragment() {
    private var _binding: FragmentGetrtBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGetrtBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.againbtn.setOnClickListener{
            findNavController().navigate(R.id.action_getrtFragment_to_gachaFragment)
        }
        binding.seeallbtn.setOnClickListener{
            findNavController().navigate(R.id.action_getrtFragment_to_listrtFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}