package com.example.meal_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meal_kotlin.databinding.FragmentWhoBinding

class WhoFragment : Fragment() {
    private var _binding: FragmentWhoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWhoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.findfriendbtn.setOnClickListener {
            findNavController().navigate(R.id.action_whoFragment_to_findfriendsetFragment)
        }
        binding.sametastebtn.setOnClickListener{
            findNavController().navigate(R.id.action_whoFragment_to_settingFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


