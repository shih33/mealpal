package com.example.meal_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meal_kotlin.databinding.FragmentMainBinding
import com.example.meal_kotlin.databinding.FragmentVresultBinding

class VresultFragment : Fragment() {
    private var _binding: FragmentVresultBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVresultBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.invite1.setOnClickListener{
            findNavController().navigate(R.id.action_vresultFragment_to_manageFragment)
        }
        binding.bidbtn1.setOnClickListener {
            binding.bidbtn1.setBackgroundResource(R.drawable.ibtn2)
        }
        binding.bidbtn2.setOnClickListener {
            binding.bidbtn2.setBackgroundResource(R.drawable.ibtn2)
        }
        binding.bidbtn3.setOnClickListener {
            binding.bidbtn3.setBackgroundResource(R.drawable.ibtn2)
        }
        binding.bidbtn4.setOnClickListener {
            binding.bidbtn4.setBackgroundResource(R.drawable.ibtn2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}