package com.example.meal_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meal_kotlin.databinding.FragmentInvitationBinding
import com.example.meal_kotlin.databinding.FragmentMainBinding

class InvitationFragment : Fragment() {
    private var _binding: FragmentInvitationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInvitationBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mymeetbtn.setOnClickListener{
            findNavController().navigate(R.id.action_invitationFragment_to_manageFragment)
        }
        binding.yesinvitebtn.setOnClickListener{
            findNavController().navigate(R.id.action_invitationFragment_to_manageFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}